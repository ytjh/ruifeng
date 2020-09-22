package com.ruifeng.service;
import com.ruifeng.pojo.UrgentMaterialPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IUrgentMaterialService  {
    // 添加
    void insert(UrgentMaterialPojo pojo);
    // 根据id查询
    UrgentMaterialPojo getById(Long matId);
    // 根据id修改
    void updateId(UrgentMaterialPojo pojo);
    // 根据id删除
    void deleteById(Long matId);
    // 根据条件查询
    List<UrgentMaterialPojo> queryBean(UrgentMaterialPojo pojo);
    // 根据条件分页查询
    IPage<UrgentMaterialPojo> queryPage(UrgentMaterialPojo pojo);
}