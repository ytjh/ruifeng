package com.ruifeng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruifeng.pojo.SysDemo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysMapper extends BaseMapper<SysDemo> {
    SysDemo getById(Integer id);
}
