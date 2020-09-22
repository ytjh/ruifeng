package com.ruifeng.service;
import com.ruifeng.core.plus.QueryPageResult;
import com.ruifeng.model.RiskModel;
import com.ruifeng.pojo.RiskPojo;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.IPage;

public interface IRiskService {
    // 添加
    void insert(RiskPojo pojo);
    // 根据id查询
    RiskPojo getById(Integer id);
    // 根据id修改
    void updateId(RiskPojo pojo);
    // 根据id删除
    void deleteById(Integer id);
    // 根据条件查询
    List<RiskPojo> queryBean(RiskPojo pojo);
    // 根据条件分页查询
    IPage<RiskPojo> queryPage(RiskPojo pojo);

    /**
     * 组装查询企业风险清单
     * @param pojo
     * @return
     */
    IPage<RiskPojo> riskListPage(RiskPojo pojo);
}