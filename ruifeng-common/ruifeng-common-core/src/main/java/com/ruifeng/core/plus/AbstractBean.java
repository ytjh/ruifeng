package com.ruifeng.core.plus;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 抽象实体
 */
@Data
public class AbstractBean implements Serializable {
    /**
     * 记录创建人
     */
    private String createBy;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录最近更新人
     */
    private String updateBy;

    /**
     * 记录最近更新时间
     */
    private Date updateTime;
    /**
     * 是否删除 0否 1是
     */
    private Integer delFlag;


}
