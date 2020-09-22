package com.ruifeng.service;
import com.ruifeng.pojo.DefectManagePojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IDefectManageService  {
    // 添加
    void insert(DefectManagePojo pojo);
    // 根据id查询
    DefectManagePojo getById(Long hidId);
    // 根据id修改
    void updateId(DefectManagePojo pojo);
    // 根据id删除
    void deleteById(Long hidId);
    // 根据条件查询
    List<DefectManagePojo> queryBean(DefectManagePojo pojo);
    // 根据条件分页查询
    IPage<DefectManagePojo> queryPage(DefectManagePojo pojo);
}