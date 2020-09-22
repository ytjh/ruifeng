package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 报警记录表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_alarm
 */
@Data
@TableName("act_alarm")
public class AlarmPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 报警id
	 */
		@TableId 	@ApiModelProperty(value = "报警id")
	private Long alertId;
	/**
	 * 报警名称
	 */
		@ApiModelProperty(value = "报警名称")
	private String alertName;
	/**
	 * 报警地点
	 */
		@ApiModelProperty(value = "报警地点")
	private String alertLocation;
	/**
	 * 报警时间
	 */
		@ApiModelProperty(value = "报警时间")
	private Date alertTime;
	/**
	 * 报警人
	 */
		@ApiModelProperty(value = "报警人")
	private String alertPerson;
	/**
	 * 报警地区负责人
	 */
		@ApiModelProperty(value = "报警地区负责人")
	private String person;
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
