package com.ruifeng.service;
import com.ruifeng.pojo.UrgentTreatmentPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IUrgentTreatmentService  {
    // 添加
    void insert(UrgentTreatmentPojo pojo);
    // 根据id查询
    UrgentTreatmentPojo getById(Long disId);
    // 根据id修改
    void updateId(UrgentTreatmentPojo pojo);
    // 根据id删除
    void deleteById(Long disId);
    // 根据条件查询
    List<UrgentTreatmentPojo> queryBean(UrgentTreatmentPojo pojo);
    // 根据条件分页查询
    IPage<UrgentTreatmentPojo> queryPage(UrgentTreatmentPojo pojo);
}