package com.ruifeng.service;
import com.ruifeng.pojo.PlacePojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IPlaceService {
    // 添加
    void insert(PlacePojo pojo);
    // 根据id查询
    PlacePojo getById(Integer id);
    // 根据id修改
    void updateId(PlacePojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<PlacePojo> queryBean(PlacePojo pojo);
    // 根据条件分页查询
    IPage<PlacePojo> queryPage(PlacePojo pojo);
}