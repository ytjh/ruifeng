package com.ruifeng.service;
import com.ruifeng.pojo.GpsPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IGpsService {
    // 添加
    void insert(GpsPojo pojo);
    // 根据id查询
    GpsPojo getById(Integer id);
    // 根据id修改
    void updateId(GpsPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<GpsPojo> queryBean(GpsPojo pojo);
    // 根据条件分页查询
    IPage<GpsPojo> queryPage(GpsPojo pojo);
}