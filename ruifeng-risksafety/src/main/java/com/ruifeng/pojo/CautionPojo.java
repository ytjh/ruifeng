package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 预警信息表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_caution
 */
@Data
@TableName("act_caution")
public class CautionPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 预警id
	 */
		@TableId 	@ApiModelProperty(value = "预警id")
	private Long warId;
	/**
	 * 预警地点
	 */
		@ApiModelProperty(value = "预警地点")
	private String warLocation;
	/**
	 * 预警描述
	 */
		@ApiModelProperty(value = "预警描述")
	private String warDescription;
	/**
	 * 处置方法
	 */
		@ApiModelProperty(value = "处置方法")
	private String dispose;
	/**
	 * 负责人
	 */
		@ApiModelProperty(value = "负责人")
	private String person;
	/**
	 * 落实情况:0 (未完成)1 (已完成)2 (已整改)3 (待复评)4 (已变更)
	 */
		@ApiModelProperty(value = "落实情况:0 (未完成)1 (已完成)2 (已整改)3 (待复评)4 (已变更)")
	private Integer implementation;
	/**
	 * 是否提醒
	 */
		@ApiModelProperty(value = "是否提醒")
	private Integer isnoPrompt;
	/**
	 * 预警状态：0待处理 1代审核 2审核未通过 3审核以通过
	 */
		@ApiModelProperty(value = "预警状态：0待处理 1代审核 2审核未通过 3审核以通过")
	private Integer proState;
	/**
	 * 预警类型 0人员报警 1视频报警 2传感器报警
	 */
		@ApiModelProperty(value = "预警类型 0人员报警 1视频报警 2传感器报警")
	private Integer warType;
	/**
	 * 视频报警
	 */
		@ApiModelProperty(value = "视频报警")
	private Integer warViod;
	/**
	 * 传感器参数报警
	 */
		@ApiModelProperty(value = "传感器参数报警")
	private Integer warParam;
	/**
	 * 传感器地址
	 */
		@ApiModelProperty(value = "传感器地址")
	private String sensorCoordinate;
	/**
	 * 视频报警图片
	 */
		@ApiModelProperty(value = "视频报警图片")
	private String viodPhoto;
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
