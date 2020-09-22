package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.pojo.PlacePojo;
import com.ruifeng.mapper.PlaceMapper;
import com.ruifeng.service.IPlaceService;
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
public class PlaceServiceImpl extends ServiceImpl<PlaceMapper, PlacePojo> implements IPlaceService{

    @Resource
    private PlaceMapper mapper;

    @Override
    public void insert(PlacePojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public PlacePojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(PlacePojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<PlacePojo> queryBean(PlacePojo pojo) {
        QueryWrapper<PlacePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<PlacePojo> queryPage(PlacePojo pojo) {
        Page<PlacePojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<PlacePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<PlacePojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}