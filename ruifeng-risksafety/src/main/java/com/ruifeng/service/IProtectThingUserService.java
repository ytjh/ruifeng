package com.ruifeng.service;
import com.ruifeng.pojo.ProtectThingUserPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IProtectThingUserService {
    // 添加
    void insert(ProtectThingUserPojo pojo);
    // 根据id查询
    ProtectThingUserPojo getById(Integer id);
    // 根据id修改
    void updateId(ProtectThingUserPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<ProtectThingUserPojo> queryBean(ProtectThingUserPojo pojo);
    // 根据条件分页查询
    IPage<ProtectThingUserPojo> queryPage(ProtectThingUserPojo pojo);
}