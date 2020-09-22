package com.ruifeng.service.impl;
import com.ruifeng.pojo.IncidentPojo;
import com.ruifeng.mapper.IncidentMapper;
import com.ruifeng.service.IIncidentService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class IncidentServiceImpl extends ServiceImpl<IncidentMapper, IncidentPojo> implements IIncidentService{

    @Resource
    private IncidentMapper mapper;

    @Override
    public void insert(IncidentPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public IncidentPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(IncidentPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<IncidentPojo> queryBean(IncidentPojo pojo) {
        QueryWrapper<IncidentPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<IncidentPojo> queryPage(IncidentPojo pojo) {
        Page<IncidentPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<IncidentPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<IncidentPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}