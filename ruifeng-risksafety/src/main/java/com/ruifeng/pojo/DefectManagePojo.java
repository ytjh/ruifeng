package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 隐患登记表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_defect_manage
 */
@Data
@TableName("act_defect_manage")
public class DefectManagePojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 隐患登记id
	 */
		@TableId 	@ApiModelProperty(value = "隐患登记id")
	private Long hidId;
	/**
	 * 风险类型
	 */
		@ApiModelProperty(value = "风险类型")
	private Integer riskType;
	/**
	 * 检查部门
	 */
		@ApiModelProperty(value = "检查部门")
	private String insDep;
	/**
	 * 检查人员
	 */
		@ApiModelProperty(value = "检查人员")
	private String insPerson;
	/**
	 * 检查地点
	 */
		@ApiModelProperty(value = "检查地点")
	private String insLocation;
	/**
	 * 存在问题
	 */
		@ApiModelProperty(value = "存在问题")
	private String problem;
	/**
	 * 隐患图片
	 */
		@ApiModelProperty(value = "隐患图片")
	private String hidPhoto;
	/**
	 * 可能造成后果
	 */
		@ApiModelProperty(value = "可能造成后果")
	private String consequence;
	/**
	 * 潜在事故
	 */
		@ApiModelProperty(value = "潜在事故")
	private String accident;
	/**
	 * 整改意见
	 */
		@ApiModelProperty(value = "整改意见")
	private String opinion;
	/**
	 * 整改人员
	 */
		@ApiModelProperty(value = "整改人员")
	private String person;
	/**
	 * 整改时间
	 */
		@ApiModelProperty(value = "整改时间")
	private Date hidTime;
	/**
	 * 公司id
	 */
		@ApiModelProperty(value = "公司id")
	private Long cmyId;
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
