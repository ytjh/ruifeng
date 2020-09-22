package com.ruifeng.service.impl;
import com.ruifeng.pojo.AlarmPojo;
import com.ruifeng.mapper.AlarmMapper;
import com.ruifeng.service.IAlarmService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class AlarmServiceImpl extends ServiceImpl<AlarmMapper, AlarmPojo> implements IAlarmService{

    @Resource
    private AlarmMapper mapper;

    @Override
    public void insert(AlarmPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public AlarmPojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(AlarmPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<AlarmPojo> queryBean(AlarmPojo pojo) {
        QueryWrapper<AlarmPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<AlarmPojo> queryPage(AlarmPojo pojo) {
        Page<AlarmPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<AlarmPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<AlarmPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}