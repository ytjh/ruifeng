package com.ruifeng.core.rest;

/**
 * 业务服务异常
 */
public class BusinessException extends RuntimeException
{
    private String code;
    private String message;
    private Object params;

    public BusinessException(String code)
    {
        this(code, null, null);
    }

    public BusinessException(String code, String message)
    {
        this(code, message, null);
    }

    public BusinessException(String code, Object params)
    {
        this(code, null, params);
    }

    public BusinessException(String code, String message, Object params)
    {
        this.code = code;
        this.message = message;
        this.params = params;
    }

    public String getCode()
    {
        return code;
    }

    @Override
    public String getMessage()
    {
        return message;
    }

    public Object getParams()
    {
        return params;
    }

    @Override
    public Throwable fillInStackTrace()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "BusinessException{" +
               "code='" + code + '\'' +
               ", message='" + message + '\'' +
               ", params=" + params +
               '}';
    }
}
