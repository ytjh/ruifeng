package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.ProtectThingUserPojo;
import com.ruifeng.mapper.ProtectThingUserMapper;
import com.ruifeng.service.IProtectThingUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;

@Service
@DS(DSRoute.COMPANY)
public class ProtectThingUserServiceImpl extends ServiceImpl<ProtectThingUserMapper, ProtectThingUserPojo> implements IProtectThingUserService{

    @Resource
    private ProtectThingUserMapper mapper;

    @Override
    public void insert(ProtectThingUserPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public ProtectThingUserPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(ProtectThingUserPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<ProtectThingUserPojo> queryBean(ProtectThingUserPojo pojo) {
        QueryWrapper<ProtectThingUserPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<ProtectThingUserPojo> queryPage(ProtectThingUserPojo pojo) {
        Page<ProtectThingUserPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<ProtectThingUserPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<ProtectThingUserPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}