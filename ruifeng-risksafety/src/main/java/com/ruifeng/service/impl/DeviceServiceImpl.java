package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.DevicePojo;
import com.ruifeng.mapper.DeviceMapper;
import com.ruifeng.service.IDeviceService;
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
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, DevicePojo> implements IDeviceService{

    @Resource
    private DeviceMapper mapper;

    @Override
    public void insert(DevicePojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public DevicePojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(DevicePojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<DevicePojo> queryBean(DevicePojo pojo) {
        QueryWrapper<DevicePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<DevicePojo> queryPage(DevicePojo pojo) {
        Page<DevicePojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<DevicePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<DevicePojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}