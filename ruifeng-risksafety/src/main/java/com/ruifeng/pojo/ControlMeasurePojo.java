package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 危险源管控措施表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:17
 * 表名 cmy_control_measure
 */
@Data
@TableName("cmy_control_measure")
public class ControlMeasurePojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(value = "编号")
	private Integer id;

	/**
	 * 企业id
	 */
	@ApiModelProperty(value = "企业id")
	private Integer companyId;

	/**
	 * 危险源id
	 */
	@ApiModelProperty(value = "危险源id")
	private Integer dangerId;

	/**
	 * 管控措施名称
	 */
	@ApiModelProperty(value = "管控措施名称")
	private String name;

	/**
	 * 管控措施类别
	 */
	@ApiModelProperty(value = "管控措施类别")
	private String type;

	/**
	 * 管控措施等级
	 */
	@ApiModelProperty(value = "管控措施等级")
	private String grade;

	/**
	 * 检查描述
	 */
	@ApiModelProperty(value = "检查描述")
	private String inspectDescribe;

	/**
	 * 检查有问题描述
	 */
	@ApiModelProperty(value = "检查有问题描述")
	private String inspectDescribeRight;

	/**
	 * 检查没问题描述
	 */
	@ApiModelProperty(value = "检查没问题描述")
	private String inspectDescribeError;

	/**
	 * 整改期限
	 */
	@ApiModelProperty(value = "整改期限")
	private Integer correctTerm;

	/**
	 * 检查频次
	 */
	@ApiModelProperty(value = "检查频次")
	private String checkRate;

	/**
	 * 是否删除
	 */
	@ApiModelProperty(value = "是否删除")
	private String delFlg;

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
	private Date createTime;

	/**
	 * 修改人
	 */
	@ApiModelProperty(value = "修改人")
	private String updateBy;

	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private Date updateTime;

}
