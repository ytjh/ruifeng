package com.ruifeng.service.impl;
import com.ruifeng.pojo.CredentialPojo;
import com.ruifeng.mapper.CredentialMapper;
import com.ruifeng.service.ICredentialService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class CredentialServiceImpl extends ServiceImpl<CredentialMapper, CredentialPojo> implements ICredentialService{

    @Resource
    private CredentialMapper mapper;

    @Override
    public void insert(CredentialPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public CredentialPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(CredentialPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<CredentialPojo> queryBean(CredentialPojo pojo) {
        QueryWrapper<CredentialPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<CredentialPojo> queryPage(CredentialPojo pojo) {
        Page<CredentialPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<CredentialPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<CredentialPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}