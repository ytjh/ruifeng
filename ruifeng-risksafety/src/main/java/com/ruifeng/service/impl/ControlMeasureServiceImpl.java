package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.ControlMeasurePojo;
import com.ruifeng.mapper.ControlMeasureMapper;
import com.ruifeng.service.IControlMeasureService;
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
public class ControlMeasureServiceImpl extends ServiceImpl<ControlMeasureMapper, ControlMeasurePojo> implements IControlMeasureService{

    @Resource
    private ControlMeasureMapper mapper;

    @Override
    public void insert(ControlMeasurePojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public ControlMeasurePojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(ControlMeasurePojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<ControlMeasurePojo> queryBean(ControlMeasurePojo pojo) {
        QueryWrapper<ControlMeasurePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<ControlMeasurePojo> queryPage(ControlMeasurePojo pojo) {
        Page<ControlMeasurePojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<ControlMeasurePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<ControlMeasurePojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}