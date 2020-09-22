package com.ruifeng.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.mapper.CmyMapper;
import com.ruifeng.mapper.SysMapper;
import com.ruifeng.pojo.CmyDemo;
import com.ruifeng.pojo.SysDemo;
import com.ruifeng.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysServiceImpl extends ServiceImpl<SysMapper, SysDemo> implements SysService {
    @Autowired
    private SysMapper sysMapper;
    @Override
    public void insert(SysDemo sysDemo) {
        sysMapper.insert(sysDemo);
    }

    @Override
    public SysDemo getById(Integer id) {
        return sysMapper.getById(id);
    }
}
