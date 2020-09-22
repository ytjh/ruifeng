package com.ruifeng.service.impl;
import com.ruifeng.pojo.CautionPojo;
import com.ruifeng.mapper.CautionMapper;
import com.ruifeng.service.ICautionService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class CautionServiceImpl extends ServiceImpl<CautionMapper, CautionPojo> implements ICautionService{

    @Resource
    private CautionMapper mapper;

    @Override
    public void insert(CautionPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public CautionPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(CautionPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<CautionPojo> queryBean(CautionPojo pojo) {
        QueryWrapper<CautionPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<CautionPojo> queryPage(CautionPojo pojo) {
        Page<CautionPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<CautionPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<CautionPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}