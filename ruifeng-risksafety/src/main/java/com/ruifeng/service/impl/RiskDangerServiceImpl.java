package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.RiskDangerPojo;
import com.ruifeng.mapper.RiskDangerMapper;
import com.ruifeng.service.IRiskDangerService;
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
public class RiskDangerServiceImpl extends ServiceImpl<RiskDangerMapper, RiskDangerPojo> implements IRiskDangerService{

    @Resource
    private RiskDangerMapper mapper;

    @Override
    public void insert(RiskDangerPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public RiskDangerPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(RiskDangerPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<RiskDangerPojo> queryBean(RiskDangerPojo pojo) {
        QueryWrapper<RiskDangerPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<RiskDangerPojo> queryPage(RiskDangerPojo pojo) {
        Page<RiskDangerPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<RiskDangerPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<RiskDangerPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}