package com.ruifeng.service;
import com.ruifeng.pojo.ControlMeasurePojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IControlMeasureService {
    // 添加
    void insert(ControlMeasurePojo pojo);
    // 根据id查询
    ControlMeasurePojo getById(Integer id);
    // 根据id修改
    void updateId(ControlMeasurePojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<ControlMeasurePojo> queryBean(ControlMeasurePojo pojo);
    // 根据条件分页查询
    IPage<ControlMeasurePojo> queryPage(ControlMeasurePojo pojo);
}