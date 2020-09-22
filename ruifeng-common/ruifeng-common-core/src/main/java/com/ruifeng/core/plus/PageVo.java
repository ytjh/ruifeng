package com.ruifeng.core.plus;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class PageVo {
    /**
     * 当前页码
     */
    @TableField(exist = false)
    private int pageNum = 1;
    /**
     * 每页数量
     */
    @TableField(exist = false)
    private int pageSize = 10;
}
