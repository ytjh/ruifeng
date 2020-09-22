package com.ruifeng.service;

import com.ruifeng.pojo.SysDemo;

public interface SysService {
    void insert(SysDemo sysDemo);
    SysDemo getById(Integer id);
}
