package com.ruifeng.service;
import com.ruifeng.pojo.DictPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IDictService  {
    // 添加
    void insert(DictPojo pojo);
    // 根据id查询
    DictPojo getById(Integer dictId);
    // 根据id修改
    void updateId(DictPojo pojo);
    // 根据id删除
    void deleteById(Integer dictId);
    // 根据条件查询
    List<DictPojo> queryBean(DictPojo pojo);
    // 根据条件分页查询
    IPage<DictPojo> queryPage(DictPojo pojo);
}