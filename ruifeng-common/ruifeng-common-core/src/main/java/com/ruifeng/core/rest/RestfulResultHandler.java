package com.ruifeng.core.rest;

import com.alibaba.fastjson.JSON;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.validation.ConstraintViolationException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.*;

/**
 * restful 结果处理器
 */
@Component
@Aspect
@RestControllerAdvice
@ControllerAdvice
public class RestfulResultHandler implements ResponseBodyAdvice<Object> {
    private static final Logger log = LoggerFactory.getLogger(RestfulResultHandler.class);


    private final ThreadLocal<RestfulResult> resultHolder    = new ThreadLocal<>();
    private final Map<Class<?>, Object>      defaultValueMap = new HashMap<>();

    public RestfulResultHandler() {
        defaultValueMap.put(boolean.class, false);
        defaultValueMap.put(char.class, '\0');
        defaultValueMap.put(byte.class, (byte) 0);
        defaultValueMap.put(short.class, (short) 0);
        defaultValueMap.put(int.class, 0);
        defaultValueMap.put(long.class, 0L);
        defaultValueMap.put(float.class, 0.0f);
        defaultValueMap.put(double.class, 0.0);
    }

    //--------------------------------- 拦截controller方法 -----------------------------------
    @Around("execution(public * com.ruifeng..*.controller..*.*(..))")
    public Object handle(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Class<?> type = signature.getDeclaringType();
        Method method = signature.getMethod();
        Logger log = LoggerFactory.getLogger(type);
        


        log.info("Enter method:{}...", signature);
        Object[] args = point.getArgs();
        List<Object> newArgs = new ArrayList<>();

        String argJSON = JSON.toJSONString(newArgs);
        log.debug("Parameters:{}.", argJSON);

        //-------------------------- 将结果、异常转为RestfulResult，并且返回类型缺省值 ----------------------------
        RestfulResult result;
        try {
            Object object = point.proceed();
            log.debug("Return:{}", object);
            if (null == object) {
                result = new RestfulResult();
            } else if (object instanceof RestfulResult) {
                result = (RestfulResult) object;
            } else {
                result = new RestfulResult(object);
            }
        } catch (InvocationTargetException e) {
            result = toRestfulResult(log, argJSON, e.getTargetException());
        } catch (UndeclaredThrowableException e) {
            result = toRestfulResult(log, argJSON, e.getUndeclaredThrowable());
        } catch (Throwable throwable) {
            result = toRestfulResult(log, argJSON, throwable);
        }
        resultHolder.set(result);

        return defaultValueMap.get(method.getReturnType());
    }

    /**
     * 将异常转为api结果
     *
     * @param log       logger
     * @param argJson   入参
     * @param throwable 异常
     * @return api结果
     */
    private RestfulResult toRestfulResult(Logger log, String argJson, Throwable throwable) {
        RestfulResult result;
       if (throwable instanceof BusinessException) {
            log.error("Parameters:{}\nException:{}.", argJson, throwable.toString());
            BusinessException e = (BusinessException) throwable;
            result = new RestfulResult(e.getCode(), e.getMessage());
        } else if (throwable instanceof ConstraintViolationException) {
            ConstraintViolationException e = (ConstraintViolationException) throwable;
            result = new RestfulResult("-1", e.getLocalizedMessage());
        } else {
            result = new RestfulResult("SYS_FAULT", "Inner exception");
        }
        return result;
    }


    //-------------------------------- ResponseBodyAdvice ------------------------------
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {

				return methodParameter.getContainingClass().isAnnotationPresent(RestController.class);
				//				return false;
    }

    //------------------------- 结果已经在controller AOP处理，这里直接返回即可 -----------------------
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        RestfulResult result = resultHolder.get();
        if (null == result) {
            return new RestfulResult(o);
        }
        resultHolder.remove();
        return result;
    }

    //------------------------- 处理方法接入controller方法之前遇到的异常 -----------------------
		@ExceptionHandler({Throwable.class})
    public Object ex(Throwable throwable) throws NoSuchFieldException, IllegalAccessException {
        resultHolder.remove();
        if (throwable instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException e = (MethodArgumentNotValidException) throwable;
            ObjectError error = e.getBindingResult().getAllErrors().get(0);
            String code = error.getCode();
            if (error instanceof FieldError) {
                FieldError fieldError = (FieldError) error;
                code = fieldError.getField() + '_' + code;
            }
            RestfulResult result = new RestfulResult("err_" + code, error.getDefaultMessage());
            log.error(JSON.toJSONString(result));
            return result;
        }
        if(throwable instanceof BusinessException){
        	RestfulResult result = new RestfulResult(((BusinessException) throwable).getCode(), throwable.getMessage());
        	return result;
        }
        return new RestfulResult("500",null);
    }

}
