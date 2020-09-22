package com.ruifeng.service;
import com.ruifeng.pojo.UrgentManeuverPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IUrgentManeuverService  {
    // 添加
    void insert(UrgentManeuverPojo pojo);
    // 根据id查询
    UrgentManeuverPojo getById(Integer manId);
    // 根据id修改
    void updateId(UrgentManeuverPojo pojo);
    // 根据id删除
    void deleteById(Integer manId);
    // 根据条件查询
    List<UrgentManeuverPojo> queryBean(UrgentManeuverPojo pojo);
    // 根据条件分页查询
    IPage<UrgentManeuverPojo> queryPage(UrgentManeuverPojo pojo);
}