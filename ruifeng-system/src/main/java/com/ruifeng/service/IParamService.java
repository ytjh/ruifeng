package com.ruifeng.service;
import com.ruifeng.pojo.ParamPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IParamService  {
    // 添加
    void insert(ParamPojo pojo);
    // 根据id查询
    ParamPojo getById(Integer paramId);
    // 根据id修改
    void updateId(ParamPojo pojo);
    // 根据id删除
    void deleteById(Integer paramId);
    // 根据条件查询
    List<ParamPojo> queryBean(ParamPojo pojo);
    // 根据条件分页查询
    IPage<ParamPojo> queryPage(ParamPojo pojo);
}