package com.ruifeng.service.impl;
import com.ruifeng.pojo.PtwPojo;
import com.ruifeng.mapper.PtwMapper;
import com.ruifeng.service.IPtwService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class PtwServiceImpl extends ServiceImpl<PtwMapper, PtwPojo> implements IPtwService{

    @Resource
    private PtwMapper mapper;

    @Override
    public void insert(PtwPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public PtwPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(PtwPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<PtwPojo> queryBean(PtwPojo pojo) {
        QueryWrapper<PtwPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<PtwPojo> queryPage(PtwPojo pojo) {
        Page<PtwPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<PtwPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<PtwPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}