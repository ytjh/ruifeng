package com.ruifeng.service;
import com.ruifeng.pojo.CredentialPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface ICredentialService  {
    // 添加
    void insert(CredentialPojo pojo);
    // 根据id查询
    CredentialPojo getById(Integer credentialId);
    // 根据id修改
    void updateId(CredentialPojo pojo);
    // 根据id删除
    void deleteById(Integer credentialId);
    // 根据条件查询
    List<CredentialPojo> queryBean(CredentialPojo pojo);
    // 根据条件分页查询
    IPage<CredentialPojo> queryPage(CredentialPojo pojo);
}