package com.ruifeng.service;
import com.ruifeng.pojo.PtwPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IPtwService  {
    // 添加
    void insert(PtwPojo pojo);
    // 根据id查询
    PtwPojo getById(Long certId);
    // 根据id修改
    void updateId(PtwPojo pojo);
    // 根据id删除
    void deleteById(Long certId);
    // 根据条件查询
    List<PtwPojo> queryBean(PtwPojo pojo);
    // 根据条件分页查询
    IPage<PtwPojo> queryPage(PtwPojo pojo);
}