package com.ruifeng.service.impl;
import com.ruifeng.pojo.UrgentMaterialPojo;
import com.ruifeng.mapper.UrgentMaterialMapper;
import com.ruifeng.service.IUrgentMaterialService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UrgentMaterialServiceImpl extends ServiceImpl<UrgentMaterialMapper, UrgentMaterialPojo> implements IUrgentMaterialService{

    @Resource
    private UrgentMaterialMapper mapper;

    @Override
    public void insert(UrgentMaterialPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public UrgentMaterialPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(UrgentMaterialPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<UrgentMaterialPojo> queryBean(UrgentMaterialPojo pojo) {
        QueryWrapper<UrgentMaterialPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<UrgentMaterialPojo> queryPage(UrgentMaterialPojo pojo) {
        Page<UrgentMaterialPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<UrgentMaterialPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<UrgentMaterialPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}