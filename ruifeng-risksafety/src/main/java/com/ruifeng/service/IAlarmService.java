package com.ruifeng.service;
import com.ruifeng.pojo.AlarmPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IAlarmService  {
    // 添加
    void insert(AlarmPojo pojo);
    // 根据id查询
    AlarmPojo getById(Long alertId);
    // 根据id修改
    void updateId(AlarmPojo pojo);
    // 根据id删除
    void deleteById(Long alertId);
    // 根据条件查询
    List<AlarmPojo> queryBean(AlarmPojo pojo);
    // 根据条件分页查询
    IPage<AlarmPojo> queryPage(AlarmPojo pojo);
}