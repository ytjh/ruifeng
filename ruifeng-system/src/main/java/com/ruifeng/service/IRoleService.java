package com.ruifeng.service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ruifeng.pojo.RolePojo;

import java.util.List;


public interface IRoleService  {
    // 添加
    void insert(RolePojo pojo);
    // 根据id查询
    RolePojo getById(Integer roleId);
    // 根据id修改
    void updateId(RolePojo pojo);
    // 根据id删除
    void deleteById(Integer roleId);
    // 根据条件查询
    List<RolePojo> queryBean(RolePojo pojo);
    // 根据条件分页查询
    IPage<RolePojo> queryPage(RolePojo pojo);
}