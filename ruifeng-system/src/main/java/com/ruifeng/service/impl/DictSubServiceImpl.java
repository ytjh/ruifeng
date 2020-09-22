package com.ruifeng.service.impl;
import com.ruifeng.pojo.DictSubPojo;
import com.ruifeng.mapper.DictSubMapper;
import com.ruifeng.service.IDictSubService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class DictSubServiceImpl extends ServiceImpl<DictSubMapper, DictSubPojo> implements IDictSubService{

    @Resource
    private DictSubMapper mapper;

    @Override
    public void insert(DictSubPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public DictSubPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(DictSubPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<DictSubPojo> queryBean(DictSubPojo pojo) {
        QueryWrapper<DictSubPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<DictSubPojo> queryPage(DictSubPojo pojo) {
        Page<DictSubPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<DictSubPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<DictSubPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}