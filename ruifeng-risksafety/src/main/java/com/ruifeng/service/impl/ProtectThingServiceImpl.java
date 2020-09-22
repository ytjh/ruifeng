package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.ProtectThingPojo;
import com.ruifeng.mapper.ProtectThingMapper;
import com.ruifeng.service.IProtectThingService;
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
public class ProtectThingServiceImpl extends ServiceImpl<ProtectThingMapper, ProtectThingPojo> implements IProtectThingService{

    @Resource
    private ProtectThingMapper mapper;

    @Override
    public void insert(ProtectThingPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public ProtectThingPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(ProtectThingPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<ProtectThingPojo> queryBean(ProtectThingPojo pojo) {
        QueryWrapper<ProtectThingPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<ProtectThingPojo> queryPage(ProtectThingPojo pojo) {
        Page<ProtectThingPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<ProtectThingPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<ProtectThingPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}