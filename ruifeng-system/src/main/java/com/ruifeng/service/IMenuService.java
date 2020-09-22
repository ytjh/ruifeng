package com.ruifeng.service;
import com.ruifeng.pojo.MenuPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IMenuService  {
    // 添加
    void insert(MenuPojo pojo);
    // 根据id查询
    MenuPojo getById(Integer menuId);
    // 根据id修改
    void updateId(MenuPojo pojo);
    // 根据id删除
    void deleteById(Integer menuId);
    // 根据条件查询
    List<MenuPojo> queryBean(MenuPojo pojo);
    // 根据条件分页查询
    IPage<MenuPojo> queryPage(MenuPojo pojo);
}