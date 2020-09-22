package com.ruifeng.service;
import com.ruifeng.pojo.AreaPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IAreaService  {
    // 添加
    void insert(AreaPojo pojo);
    // 根据id查询
    AreaPojo getById(Integer areaId);
    // 根据id修改
    void updateId(AreaPojo pojo);
    // 根据id删除
    void deleteById(Integer areaId);
    // 根据条件查询
    List<AreaPojo> queryBean(AreaPojo pojo);
    // 根据条件分页查询
    IPage<AreaPojo> queryPage(AreaPojo pojo);
}