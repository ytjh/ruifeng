package com.ruifeng.service.impl;
import com.ruifeng.pojo.LogPojo;
import com.ruifeng.mapper.LogMapper;
import com.ruifeng.service.ILogService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, LogPojo> implements ILogService{

    @Resource
    private LogMapper mapper;

    @Override
    public void insert(LogPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public LogPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(LogPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<LogPojo> queryBean(LogPojo pojo) {
        QueryWrapper<LogPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<LogPojo> queryPage(LogPojo pojo) {
        Page<LogPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<LogPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<LogPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}