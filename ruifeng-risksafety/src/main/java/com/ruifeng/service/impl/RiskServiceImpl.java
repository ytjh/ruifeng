package com.ruifeng.service.impl;
import com.ruifeng.core.datasource.DS;
import com.ruifeng.core.datasource.DSRoute;
import com.ruifeng.core.datasource.DataSourceContextHolder;
import com.ruifeng.core.plus.QueryPageResult;
import com.ruifeng.model.RiskModel;
import com.ruifeng.pojo.DangerPojo;
import com.ruifeng.pojo.RiskPojo;
import com.ruifeng.mapper.RiskMapper;
import com.ruifeng.service.IDangerService;
import com.ruifeng.service.IRiskService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RiskServiceImpl extends ServiceImpl<RiskMapper, RiskPojo> implements IRiskService{

    @Resource
    private RiskMapper mapper;

    @Autowired
    private IDangerService dangerService;

    @Override
    public void insert(RiskPojo pojo) {
        mapper.insert(pojo);
    }

    @Override
    public RiskPojo getById(Integer alertId) {
        return mapper.selectById(alertId);
    }

    @Override
    public void updateId(RiskPojo pojo) {
        mapper.updateById(pojo);
    }

    @Override
    public void deleteById(Integer alertId) {
        mapper.deleteById(alertId);
    }

    @Override
    public List<RiskPojo> queryBean(RiskPojo pojo) {
        QueryWrapper<RiskPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        return mapper.selectList(wrapper);
    }

    @Override
    public IPage<RiskPojo> queryPage(RiskPojo pojo) {
        Page<RiskPojo> page =new Page<>(pojo.getPageNum(),pojo.getPageSize());
        QueryWrapper<RiskPojo> wrapper = Wrappers.query();
        wrapper.setEntity(pojo);
        IPage<RiskPojo> iPage = mapper.selectPage(page,wrapper);
        return iPage;
    }

    @Override
    public IPage<RiskPojo> riskListPage(RiskPojo pojo) {
        IPage<RiskPojo>  iPage =  this.queryPage(pojo);
        List<RiskPojo> pojoList = iPage.getRecords();
        DataSourceContextHolder.clearDB();
        DataSourceContextHolder.setDB(DSRoute.COMPANY);
        for (RiskPojo riskPojo:pojoList){
            DangerPojo dangerPojo = dangerService.getCmyId(riskPojo.getCompanyId());
            if (dangerPojo!=null){
                riskPojo.setDangerName(dangerPojo.getName());
            }
        }
        iPage.setRecords(pojoList);
        return iPage;
    }

}