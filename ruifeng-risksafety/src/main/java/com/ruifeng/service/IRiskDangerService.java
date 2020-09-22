package com.ruifeng.service;
import com.ruifeng.pojo.RiskDangerPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IRiskDangerService {
    // 添加
    void insert(RiskDangerPojo pojo);
    // 根据id查询
    RiskDangerPojo getById(Integer id);
    // 根据id修改
    void updateId(RiskDangerPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<RiskDangerPojo> queryBean(RiskDangerPojo pojo);
    // 根据条件分页查询
    IPage<RiskDangerPojo> queryPage(RiskDangerPojo pojo);
}