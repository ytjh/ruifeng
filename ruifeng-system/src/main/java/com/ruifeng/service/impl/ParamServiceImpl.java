package com.ruifeng.service.impl;
import com.ruifeng.pojo.ParamPojo;
import com.ruifeng.mapper.ParamMapper;
import com.ruifeng.service.IParamService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class ParamServiceImpl extends ServiceImpl<ParamMapper, ParamPojo> implements IParamService{

    @Resource
    private ParamMapper mapper;

    @Override
    public void insert(ParamPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public ParamPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(ParamPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<ParamPojo> queryBean(ParamPojo pojo) {
        QueryWrapper<ParamPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<ParamPojo> queryPage(ParamPojo pojo) {
        Page<ParamPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<ParamPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<ParamPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}