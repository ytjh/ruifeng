package com.ruifeng.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.core.plus.QueryPageResult;
import com.ruifeng.pojo.CmyDemo;

public interface CmyService {
    void insert(CmyDemo cmyDemo);
    CmyDemo getById(Integer id);
    IPage<CmyDemo> getPage(CmyDemo cmyDemo);

    QueryPageResult queryPage(CmyDemo cmyDemo);
}
