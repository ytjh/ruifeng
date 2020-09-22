package com.ruifeng.model;

import com.ruifeng.pojo.RiskPojo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RiskModel extends RiskPojo {
    @ApiModelProperty(value = "危险源名称")
    private String dangerName;
}
