package com.ruifeng.service.impl;
import com.ruifeng.pojo.DictPojo;
import com.ruifeng.mapper.DictMapper;
import com.ruifeng.service.IDictService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, DictPojo> implements IDictService{

    @Resource
    private DictMapper mapper;

    @Override
    public void insert(DictPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public DictPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(DictPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<DictPojo> queryBean(DictPojo pojo) {
        QueryWrapper<DictPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<DictPojo> queryPage(DictPojo pojo) {
        Page<DictPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<DictPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<DictPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}