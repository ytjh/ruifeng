package com.ruifeng.core.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataSourceContextHolder {
    private static final Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

    private static final ThreadLocal<DSRoute> contextHolder = new ThreadLocal<>();

    // 设置数据源名
    public static void setDB(DSRoute route) {
        log.debug("Switch to route:{}.", route.name());
        contextHolder.set(route);
    }

    // 获取数据源名
    public static DSRoute getDB() {
        return contextHolder.get();
    }

    // 清除数据源名
    public static void clearDB() {
        contextHolder.remove();
    }

}
