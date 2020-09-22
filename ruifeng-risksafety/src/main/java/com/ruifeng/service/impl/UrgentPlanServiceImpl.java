package com.ruifeng.service.impl;
import com.ruifeng.pojo.UrgentPlanPojo;
import com.ruifeng.mapper.UrgentPlanMapper;
import com.ruifeng.service.IUrgentPlanService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UrgentPlanServiceImpl extends ServiceImpl<UrgentPlanMapper, UrgentPlanPojo> implements IUrgentPlanService{

    @Resource
    private UrgentPlanMapper mapper;

    @Override
    public void insert(UrgentPlanPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public UrgentPlanPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(UrgentPlanPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<UrgentPlanPojo> queryBean(UrgentPlanPojo pojo) {
        QueryWrapper<UrgentPlanPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<UrgentPlanPojo> queryPage(UrgentPlanPojo pojo) {
        Page<UrgentPlanPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<UrgentPlanPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<UrgentPlanPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}