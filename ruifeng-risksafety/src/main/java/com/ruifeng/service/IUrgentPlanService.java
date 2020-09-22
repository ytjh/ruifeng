package com.ruifeng.service;
import com.ruifeng.pojo.UrgentPlanPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IUrgentPlanService  {
    // 添加
    void insert(UrgentPlanPojo pojo);
    // 根据id查询
    UrgentPlanPojo getById(Long planId);
    // 根据id修改
    void updateId(UrgentPlanPojo pojo);
    // 根据id删除
    void deleteById(Long planId);
    // 根据条件查询
    List<UrgentPlanPojo> queryBean(UrgentPlanPojo pojo);
    // 根据条件分页查询
    IPage<UrgentPlanPojo> queryPage(UrgentPlanPojo pojo);
}