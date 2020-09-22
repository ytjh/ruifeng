package com.ruifeng.service.impl;
import com.ruifeng.pojo.DefectManagePojo;
import com.ruifeng.mapper.DefectManageMapper;
import com.ruifeng.service.IDefectManageService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import javax.annotation.Resource;
import java.util.List;
@Service
public class DefectManageServiceImpl extends ServiceImpl<DefectManageMapper, DefectManagePojo> implements IDefectManageService{

    @Resource
    private DefectManageMapper mapper;

    @Override
    public void insert(DefectManagePojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public DefectManagePojo getById(Long alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(DefectManagePojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Long alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<DefectManagePojo> queryBean(DefectManagePojo pojo) {
        QueryWrapper<DefectManagePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<DefectManagePojo> queryPage(DefectManagePojo pojo) {
        Page<DefectManagePojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<DefectManagePojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<DefectManagePojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

}