package com.ruifeng.service;
import com.ruifeng.pojo.DictSubPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IDictSubService  {
    // 添加
    void insert(DictSubPojo pojo);
    // 根据id查询
    DictSubPojo getById(Integer subDictId);
    // 根据id修改
    void updateId(DictSubPojo pojo);
    // 根据id删除
    void deleteById(Integer subDictId);
    // 根据条件查询
    List<DictSubPojo> queryBean(DictSubPojo pojo);
    // 根据条件分页查询
    IPage<DictSubPojo> queryPage(DictSubPojo pojo);
}