package com.ruifeng.core.plus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页条件
 */

public class PageRequest {
    private final Logger log = LoggerFactory.getLogger(getClass());
    /**
     * 当前页码
     */
    private int pageNum = 1;
    /**
     * 每页数量
     */
    private int pageSize = 10;

    /**
     * 是否支持分页
     */
    private boolean pageable = true;
    /**
     * 排序列表
     */
    private List<Sort> sortList;



    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }
    public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
    }


    public List<Sort> getSortList() {
        return sortList;
    }

    public void setSortList(List<Sort> sortList) {
        this.sortList = sortList;
    }

    /**
     * 添加排序
     *
     * @param sort 排序
     */
    public void addSort(Sort sort) {
        if (sortList == null) {
            sortList = new ArrayList<>();
        }
        sortList.add(sort);
    }
}
