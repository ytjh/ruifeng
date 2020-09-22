package com.ruifeng.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruifeng.pojo.RolePojo;
import com.ruifeng.mapper.RoleMapper;
import com.ruifeng.service.IRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RolePojo> implements IRoleService{

    @Resource
    private RoleMapper mapper;

    @Override
    public void insert(RolePojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public RolePojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(RolePojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<RolePojo> queryBean(RolePojo pojo) {
        QueryWrapper<RolePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<RolePojo> queryPage(RolePojo pojo) {
        Page<RolePojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<RolePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<RolePojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}