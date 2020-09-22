package com.ruifeng.service;
import com.ruifeng.pojo.OrgPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IOrgService  {
    // 添加
    void insert(OrgPojo pojo);
    // 根据id查询
    OrgPojo getById(Integer orgId);
    // 根据id修改
    void updateId(OrgPojo pojo);
    // 根据id删除
    void deleteById(Integer orgId);
    // 根据条件查询
    List<OrgPojo> queryBean(OrgPojo pojo);
    // 根据条件分页查询
    IPage<OrgPojo> queryPage(OrgPojo pojo);
}