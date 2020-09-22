package com.ruifeng.service;
import com.ruifeng.pojo.PlaceUserPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IPlaceUserService {
    // 添加
    void insert(PlaceUserPojo pojo);
    // 根据id查询
    PlaceUserPojo getById(Integer id);
    // 根据id修改
    void updateId(PlaceUserPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<PlaceUserPojo> queryBean(PlaceUserPojo pojo);
    // 根据条件分页查询
    IPage<PlaceUserPojo> queryPage(PlaceUserPojo pojo);
}