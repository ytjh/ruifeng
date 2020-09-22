package com.ruifeng.service.impl;
import com.ruifeng.pojo.UrgentManeuverPojo;
import com.ruifeng.mapper.UrgentManeuverMapper;
import com.ruifeng.service.IUrgentManeuverService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class UrgentManeuverServiceImpl extends ServiceImpl<UrgentManeuverMapper, UrgentManeuverPojo> implements IUrgentManeuverService{

    @Resource
    private UrgentManeuverMapper mapper;

    @Override
    public void insert(UrgentManeuverPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public UrgentManeuverPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(UrgentManeuverPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<UrgentManeuverPojo> queryBean(UrgentManeuverPojo pojo) {
        QueryWrapper<UrgentManeuverPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<UrgentManeuverPojo> queryPage(UrgentManeuverPojo pojo) {
        Page<UrgentManeuverPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<UrgentManeuverPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<UrgentManeuverPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}