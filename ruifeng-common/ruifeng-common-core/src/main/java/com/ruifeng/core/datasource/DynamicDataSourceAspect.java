package com.ruifeng.core.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Order(99)
public class DynamicDataSourceAspect{
    private static final Logger log = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Before("execution(public * com.ruifeng..*Impl.*(..))")
    public void beforeSwitchDS(JoinPoint point) {
        // 获得当前访问的class
        Class<?> clazz = point.getTarget().getClass();
        // 获得访问的方法名
        String methodName = point.getSignature().getName();
        // 得到方法的参数的类型
        Class[] argClass = ((MethodSignature) point.getSignature()).getParameterTypes();
        DSRoute route = DSRoute.SYSTEM;
        try {
            // 得到访问的方法对象
            Method method = clazz.getMethod(methodName, argClass);
            // 判断是否存在@DS注解
            if (method.isAnnotationPresent(DS.class)) {
                DS annotation = method.getAnnotation(DS.class);
                route = annotation.value();
            } else if (clazz.isAnnotationPresent(DS.class)) {
                DS annotation = clazz.getDeclaredAnnotation(DS.class);
                route = annotation.value();
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        // 切换数据源
        DataSourceContextHolder.setDB(route);
    }

    @After("@annotation(com.ruifeng.core.datasource.DS)")
    public void afterSwitchDS(JoinPoint point) {
        DataSourceContextHolder.clearDB();
    }
}
