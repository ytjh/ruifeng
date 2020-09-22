package com.ruifeng.core;

import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.core.datasource.DynamicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.IdentityHashMap;
import java.util.Map;

@Configuration
@EnableScheduling
@EnableCaching
public class ServiceAutoConfiguration {
    // ---------------------------- DB相关配置 -----------------------------
    @Bean(name = "systemDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.system")
    public DataSource getSystemDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "companyDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.company")
    public DataSource getCompanyDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "actDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.act")
    public DataSource getActDataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     */
    @Primary
    @Bean(name = "dataSource")
    public DataSource getDatasource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(getSystemDataSource());
        // 配置多数据源
        Map<Object, Object> dsCtxt = new IdentityHashMap<>();
        dsCtxt.put(DSRoute.SYSTEM, getSystemDataSource());
        dsCtxt.put(DSRoute.COMPANY, getCompanyDataSource());
        dsCtxt.put(DSRoute.ACT, getActDataSource());

        dynamicDataSource.setTargetDataSources(dsCtxt);
        return dynamicDataSource;
    }


    @Bean
    public PlatformTransactionManager getTransactionManager() {
        return new DataSourceTransactionManager(getDatasource());
    }


}
