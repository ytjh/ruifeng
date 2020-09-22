package com.ruifeng.service.impl;
import com.ruifeng.pojo.UserRolePojo;
import com.ruifeng.mapper.UserRoleMapper;
import com.ruifeng.service.IUserRoleService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRolePojo> implements IUserRoleService{

    @Resource
    private UserRoleMapper mapper;

    @Override
    public void insert(UserRolePojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public UserRolePojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(UserRolePojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<UserRolePojo> queryBean(UserRolePojo pojo) {
        QueryWrapper<UserRolePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<UserRolePojo> queryPage(UserRolePojo pojo) {
        Page<UserRolePojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<UserRolePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<UserRolePojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}