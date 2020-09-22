package com.ruifeng.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.core.plus.QueryPageResult;
import com.ruifeng.mapper.CmyMapper;
import com.ruifeng.pojo.CmyDemo;
import com.ruifeng.service.CmyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@DS(DSRoute.COMPANY)
@Service
public class CmyServiceImpl extends ServiceImpl<CmyMapper, CmyDemo> implements CmyService {
    @Autowired
    private CmyMapper cmyMapper;
    @Override
    public void insert(CmyDemo cmyDemo) {
        cmyMapper.insert(cmyDemo);
    }

    @Override
    public CmyDemo getById(Integer id) {
        return cmyMapper.getById(1);
    }

    @Override
    public IPage<CmyDemo> getPage(CmyDemo cmyDemo) {
        QueryWrapper<CmyDemo> wrapper = new QueryWrapper<>();
        wrapper.eq("name","ssss");
        Page<CmyDemo> page = new Page<>(3, 5);
        IPage<CmyDemo> userIPage = cmyMapper.selectPage(page,wrapper);
        return userIPage;
    }

    @Override
    public QueryPageResult queryPage(CmyDemo cmyDemo) {
        long count = cmyMapper.getCount(cmyDemo);
        List<CmyDemo> list = cmyMapper.queryPage(cmyDemo);
        return new QueryPageResult<>(count,list);
    }
}
