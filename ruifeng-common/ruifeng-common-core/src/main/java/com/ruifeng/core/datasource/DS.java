package com.ruifeng.core.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DS {
    /**
     * 设置数据源路由
     * 默认路由到 系统
     *
     * @return 路由
     */
    DSRoute value() default DSRoute.SYSTEM;
}
