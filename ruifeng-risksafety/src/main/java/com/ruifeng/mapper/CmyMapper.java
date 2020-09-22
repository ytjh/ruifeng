package com.ruifeng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruifeng.pojo.CmyDemo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmyMapper extends BaseMapper<CmyDemo> {
    /**
     * 自定义根据id查询
     * @param id
     * @return
     */
    CmyDemo getById(Integer id);

    /**
     * 自定义分页查询，适用多条件对象查询
     * @param cmyDemo
     * @return
     */
    List<CmyDemo> queryPage(CmyDemo cmyDemo);

    /**
     * 查询数量
     * @param cmyDemo
     * @return
     */
    Long getCount(CmyDemo cmyDemo);
}
