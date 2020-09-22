package com.ruifeng.service;
import com.ruifeng.pojo.RoleMenuPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IRoleMenuService  {
    // 添加
    void insert(RoleMenuPojo pojo);
    // 根据id查询
    RoleMenuPojo getById(Integer sysRoleId);
    // 根据id修改
    void updateId(RoleMenuPojo pojo);
    // 根据id删除
    void deleteById(Integer sysRoleId);
    // 根据条件查询
    List<RoleMenuPojo> queryBean(RoleMenuPojo pojo);
    // 根据条件分页查询
    IPage<RoleMenuPojo> queryPage(RoleMenuPojo pojo);
}