package com.ruifeng.service;
import com.ruifeng.pojo.CautionPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ICautionService  {
    // 添加
    void insert(CautionPojo pojo);
    // 根据id查询
    CautionPojo getById(Long warId);
    // 根据id修改
    void updateId(CautionPojo pojo);
    // 根据id删除
    void deleteById(Long warId);
    // 根据条件查询
    List<CautionPojo> queryBean(CautionPojo pojo);
    // 根据条件分页查询
    IPage<CautionPojo> queryPage(CautionPojo pojo);
}