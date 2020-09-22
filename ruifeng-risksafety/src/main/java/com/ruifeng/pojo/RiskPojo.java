package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 企业风险点表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:17
 * 表名 cmy_risk
 */
@Data
@TableName("cmy_risk")
public class RiskPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(value = "编号")
	private Integer id;

	/**
	 * 风险点名称
	 */
	@ApiModelProperty(value = "风险点名称")
	private String name;

	/**
	 * 企业id
	 */
	@ApiModelProperty(value = "企业id")
	private Integer companyId;

	/**
	 * 企业场所id
	 */
	@ApiModelProperty(value = "企业场所id")
	private Integer placeId;

	/**
	 * 是否删除
	 */
	@ApiModelProperty(value = "是否删除")
	private Integer delFlg = 0;

	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remark;

	/**
	 * 创建人
	 */
	@ApiModelProperty(value = "创建人")
	private String createBy;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime =new Date();

	/**
	 * 修改人
	 */
	@ApiModelProperty(value = "修改人")
	private String updateBy;

	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private Date updateTime =new Date();
	@ApiModelProperty(value = "风险源编号")
	private String riskCode;
	@ApiModelProperty(value = "风险因素分类")
	private String riskFactor;

	@TableField(exist = false)
	@ApiModelProperty(value = "危险源名称")
	private String dangerName;

}
