package com.ruifeng.service.impl;
import com.ruifeng.pojo.AreaPojo;
import com.ruifeng.mapper.AreaMapper;
import com.ruifeng.service.IAreaService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, AreaPojo> implements IAreaService{

    @Resource
    private AreaMapper mapper;

    @Override
    public void insert(AreaPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public AreaPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(AreaPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<AreaPojo> queryBean(AreaPojo pojo) {
        QueryWrapper<AreaPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<AreaPojo> queryPage(AreaPojo pojo) {
        Page<AreaPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<AreaPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<AreaPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}