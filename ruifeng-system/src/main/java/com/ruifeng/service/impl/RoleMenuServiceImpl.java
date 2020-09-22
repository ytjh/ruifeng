package com.ruifeng.service.impl;
import com.ruifeng.pojo.RoleMenuPojo;
import com.ruifeng.mapper.RoleMenuMapper;
import com.ruifeng.service.IRoleMenuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuPojo> implements IRoleMenuService{

    @Resource
    private RoleMenuMapper mapper;

    @Override
    public void insert(RoleMenuPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public RoleMenuPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(RoleMenuPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<RoleMenuPojo> queryBean(RoleMenuPojo pojo) {
        QueryWrapper<RoleMenuPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<RoleMenuPojo> queryPage(RoleMenuPojo pojo) {
        Page<RoleMenuPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<RoleMenuPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<RoleMenuPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}