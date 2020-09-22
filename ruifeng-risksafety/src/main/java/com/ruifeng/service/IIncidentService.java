package com.ruifeng.service;
import com.ruifeng.pojo.IncidentPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IIncidentService  {
    // 添加
    void insert(IncidentPojo pojo);
    // 根据id查询
    IncidentPojo getById(Long accId);
    // 根据id修改
    void updateId(IncidentPojo pojo);
    // 根据id删除
    void deleteById(Long accId);
    // 根据条件查询
    List<IncidentPojo> queryBean(IncidentPojo pojo);
    // 根据条件分页查询
    IPage<IncidentPojo> queryPage(IncidentPojo pojo);
}