package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.PlaceUserPojo;
import com.ruifeng.mapper.PlaceUserMapper;
import com.ruifeng.service.IPlaceUserService;
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
public class PlaceUserServiceImpl extends ServiceImpl<PlaceUserMapper, PlaceUserPojo> implements IPlaceUserService{

    @Resource
    private PlaceUserMapper mapper;

    @Override
    public void insert(PlaceUserPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public PlaceUserPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(PlaceUserPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<PlaceUserPojo> queryBean(PlaceUserPojo pojo) {
        QueryWrapper<PlaceUserPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<PlaceUserPojo> queryPage(PlaceUserPojo pojo) {
        Page<PlaceUserPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<PlaceUserPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<PlaceUserPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}