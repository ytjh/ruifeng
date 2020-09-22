package com.ruifeng.core.plus;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 分页返回结果
 */
@Data
@ToString
public class QueryPageResult<T> {
    /**
     * 记录总数
     */
    private long total;
    /**
     * 页码总数
     */
    private int current;
    /**
     * 数据模型
     */
    private List<?> records;
    public QueryPageResult(long total, List<T> records)
    {
        this.total = total;
        this.records = records;
    }
}
