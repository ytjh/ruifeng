package com.ruifeng.core.rest;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * restful接口返回结果
 */
public class RestfulResult
{
    /**
     * 返回码：请求成功
     */
    public static final String SUCCESS = "0";

    private static ResourceBundle bundle;

    static
    {
        try
        {
            bundle = ResourceBundle.getBundle("i18n/error_message", Locale.SIMPLIFIED_CHINESE);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private final String code;
    private final String message;
    private final Object object;

    /**
     * 成功结果构造方法
     */
    public RestfulResult()
    {
        this(null);
    }

    /**
     * 成功结果构造方法
     *
     * @param object 参数
     */
    public RestfulResult(Object object)
    {
        this(SUCCESS, "success", object);
    }

    /**
     * 失败结果构造方法
     *
     * @param code    结果编码
     * @param message 结果信息
     */
    public RestfulResult(String code, String message)
    {
        this(code, message, null);
    }

    /**
     * 结果构造方法
     *
     * @param code    结果编码
     * @param message 结果信息
     * @param object  参数
     */
    public RestfulResult(String code, String message, Object object)
    {
        this.code = code;
        this.object = object;

        if (null != bundle && bundle.containsKey(code))
        {
            this.message = bundle.getString(code);
        }
        else
        {
            this.message = message;
        }
    }

    public String getCode()
    {
        return code;
    }

    public String getMessage()
    {
        return message;
    }

    public Object getObject()
    {
        return object;
    }
}
