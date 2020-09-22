package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 应急计划表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_urgent_plan
 */
@Data
@TableName("act_urgent_plan")
public class UrgentPlanPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 应急计划id
	 */
		@TableId 	@ApiModelProperty(value = "应急计划id")
	private Long planId;
	/**
	 * 公司id
	 */
		@ApiModelProperty(value = "公司id")
	private Long cmyId;
	/**
	 * 预案名称
	 */
		@ApiModelProperty(value = "预案名称")
	private String planName;
	/**
	 * 预案内容
	 */
		@ApiModelProperty(value = "预案内容")
	private String planContent;
	/**
	 * 负责人
	 */
		@ApiModelProperty(value = "负责人")
	private String person;
	/**
	 * 负责人电话
	 */
		@ApiModelProperty(value = "负责人电话")
	private String phone;
	/**
	 * 事故编码
	 */
		@ApiModelProperty(value = "事故编码")
	private String code;
	/**
	 * 物料编码
	 */
		@ApiModelProperty(value = "物料编码")
	private Integer matCode;
	/**
	 * 备注
	 */
		@ApiModelProperty(value = "备注")
	private String remark;
	/**
	 * 创建时间
	 */
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 创建人
	 */
		@ApiModelProperty(value = "创建人")
	private String createBy;
	/**
	 * 修改时间
	 */
		@ApiModelProperty(value = "修改时间")
	private Date updateTime;
	/**
	 * 修改人
	 */
		@ApiModelProperty(value = "修改人")
	private String updateBy;
	/**
	 * 是否删除
	 */
		@ApiModelProperty(value = "是否删除")
	private Integer delFlg;

}
