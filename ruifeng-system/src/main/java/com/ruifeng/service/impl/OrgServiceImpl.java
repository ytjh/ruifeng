package com.ruifeng.service.impl;
import com.ruifeng.pojo.OrgPojo;
import com.ruifeng.mapper.OrgMapper;
import com.ruifeng.service.IOrgService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class OrgServiceImpl extends ServiceImpl<OrgMapper, OrgPojo> implements IOrgService{

    @Resource
    private OrgMapper mapper;

    @Override
    public void insert(OrgPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public OrgPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(OrgPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<OrgPojo> queryBean(OrgPojo pojo) {
        QueryWrapper<OrgPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<OrgPojo> queryPage(OrgPojo pojo) {
        Page<OrgPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<OrgPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<OrgPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}