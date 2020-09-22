package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 企业风险点危险源关联表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:17
 * 表名 cmy_risk_danger
 */
@Data
@TableName("cmy_risk_danger")
public class RiskDangerPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 风险点和危险源关联表
	 */
	@TableId
	@ApiModelProperty(value = "风险点和危险源关联表")
	private Integer id;

	/**
	 * 企业id
	 */
	@ApiModelProperty(value = "企业id")
	private Integer companyId;

	/**
	 * 车间id
	 */
	@ApiModelProperty(value = "车间id")
	private Integer placeId;

	/**
	 * 风险点id
	 */
	@ApiModelProperty(value = "风险点id")
	private Integer riskId;

	/**
	 * 危险源id
	 */
	@ApiModelProperty(value = "危险源id")
	private Integer dangerId;

}
