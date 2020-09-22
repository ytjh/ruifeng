package com.ruifeng.service;
import com.ruifeng.pojo.LogPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ILogService  {
    // 添加
    void insert(LogPojo pojo);
    // 根据id查询
    LogPojo getById(Integer logId);
    // 根据id修改
    void updateId(LogPojo pojo);
    // 根据id删除
    void deleteById(Integer logId);
    // 根据条件查询
    List<LogPojo> queryBean(LogPojo pojo);
    // 根据条件分页查询
    IPage<LogPojo> queryPage(LogPojo pojo);
}