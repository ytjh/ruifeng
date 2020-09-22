package com.ruifeng.service.impl;
import com.ruifeng.pojo.UrgentTreatmentPojo;
import com.ruifeng.mapper.UrgentTreatmentMapper;
import com.ruifeng.service.IUrgentTreatmentService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UrgentTreatmentServiceImpl extends ServiceImpl<UrgentTreatmentMapper, UrgentTreatmentPojo> implements IUrgentTreatmentService{

    @Resource
    private UrgentTreatmentMapper mapper;

    @Override
    public void insert(UrgentTreatmentPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public UrgentTreatmentPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(UrgentTreatmentPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<UrgentTreatmentPojo> queryBean(UrgentTreatmentPojo pojo) {
        QueryWrapper<UrgentTreatmentPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<UrgentTreatmentPojo> queryPage(UrgentTreatmentPojo pojo) {
        Page<UrgentTreatmentPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<UrgentTreatmentPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<UrgentTreatmentPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}