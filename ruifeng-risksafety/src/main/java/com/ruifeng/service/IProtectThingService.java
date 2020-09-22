package com.ruifeng.service;
import com.ruifeng.pojo.ProtectThingPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IProtectThingService {
    // 添加
    void insert(ProtectThingPojo pojo);
    // 根据id查询
    ProtectThingPojo getById(Integer id);
    // 根据id修改
    void updateId(ProtectThingPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<ProtectThingPojo> queryBean(ProtectThingPojo pojo);
    // 根据条件分页查询
    IPage<ProtectThingPojo> queryPage(ProtectThingPojo pojo);
}