package com.ruifeng.service;
import com.ruifeng.pojo.UserRolePojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IUserRoleService  {
    // 添加
    void insert(UserRolePojo pojo);
    // 根据id查询
    UserRolePojo getById(Integer userRoleId);
    // 根据id修改
    void updateId(UserRolePojo pojo);
    // 根据id删除
    void deleteById(Integer userRoleId);
    // 根据条件查询
    List<UserRolePojo> queryBean(UserRolePojo pojo);
    // 根据条件分页查询
    IPage<UserRolePojo> queryPage(UserRolePojo pojo);
}