package com.ruifeng.service.impl;
import com.ruifeng.pojo.MenuPojo;
import com.ruifeng.mapper.MenuMapper;
import com.ruifeng.service.IMenuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuPojo> implements IMenuService{

    @Resource
    private MenuMapper mapper;

    @Override
    public void insert(MenuPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public MenuPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(MenuPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<MenuPojo> queryBean(MenuPojo pojo) {
        QueryWrapper<MenuPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<MenuPojo> queryPage(MenuPojo pojo) {
        Page<MenuPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<MenuPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<MenuPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}