package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.GpsPojo;
import com.ruifeng.mapper.GpsMapper;
import com.ruifeng.service.IGpsService;
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
public class GpsServiceImpl extends ServiceImpl<GpsMapper, GpsPojo> implements IGpsService{

    @Resource
    private GpsMapper mapper;

    @Override
    public void insert(GpsPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public GpsPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(GpsPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<GpsPojo> queryBean(GpsPojo pojo) {
        QueryWrapper<GpsPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<GpsPojo> queryPage(GpsPojo pojo) {
        Page<GpsPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<GpsPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<GpsPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}