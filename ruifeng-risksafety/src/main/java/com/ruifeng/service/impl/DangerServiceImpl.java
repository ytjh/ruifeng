package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.DangerPojo;
import com.ruifeng.mapper.DangerMapper;
import com.ruifeng.service.IDangerService;
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
public class DangerServiceImpl extends ServiceImpl<DangerMapper, DangerPojo> implements IDangerService{

    @Resource
    private DangerMapper mapper;

    @Override
    public void insert(DangerPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public DangerPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(DangerPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<DangerPojo> queryBean(DangerPojo pojo) {
        QueryWrapper<DangerPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<DangerPojo> queryPage(DangerPojo pojo) {
        Page<DangerPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<DangerPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<DangerPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

    @Override
    public DangerPojo getCmyId(Integer companyId) {
        QueryWrapper<DangerPojo> wrapper = Wrappers.query();
        wrapper.eq("companyId",companyId);
        DangerPojo dangerPojo = mapper.selectOne(wrapper);
        return dangerPojo;
    }

}