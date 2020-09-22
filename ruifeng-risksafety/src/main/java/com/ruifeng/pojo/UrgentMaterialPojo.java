package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 应急物料表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_urgent_material
 */
@Data
@TableName("act_urgent_material")
public class UrgentMaterialPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 物料id
	 */
		@TableId 	@ApiModelProperty(value = "物料id")
	private Long matId;
	/**
	 * 应急计划id
	 */
		@ApiModelProperty(value = "应急计划id")
	private Long planId;
	/**
	 * 公司id
	 */
		@ApiModelProperty(value = "公司id")
	private Long cmyId;
	/**
	 * 物料编码
	 */
		@ApiModelProperty(value = "物料编码")
	private Integer matCode;
	/**
	 * 物料名称
	 */
		@ApiModelProperty(value = "物料名称")
	private String matName;
	/**
	 * 物料位置
	 */
		@ApiModelProperty(value = "物料位置")
	private String matLocation;
	/**
	 * 物料数量
	 */
		@ApiModelProperty(value = "物料数量")
	private Double matCount;
	/**
	 * 物料单位
	 */
		@ApiModelProperty(value = "物料单位")
	private String matUnit;
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
