package com.ruifeng.service;
import com.ruifeng.pojo.DangerPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IDangerService {
    // 添加
    void insert(DangerPojo pojo);
    // 根据id查询
    DangerPojo getById(Integer id);
    // 根据id修改
    void updateId(DangerPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<DangerPojo> queryBean(DangerPojo pojo);
    // 根据条件分页查询
    IPage<DangerPojo> queryPage(DangerPojo pojo);

    DangerPojo getCmyId(Integer companyId);
}