package com.ruifeng.service;
import com.ruifeng.pojo.DevicePojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IDeviceService {
    // 添加
    void insert(DevicePojo pojo);
    // 根据id查询
    DevicePojo getById(Integer id);
    // 根据id修改
    void updateId(DevicePojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<DevicePojo> queryBean(DevicePojo pojo);
    // 根据条件分页查询
    IPage<DevicePojo> queryPage(DevicePojo pojo);
}