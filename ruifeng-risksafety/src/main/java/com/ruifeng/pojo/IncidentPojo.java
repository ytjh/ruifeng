package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 事故记录表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_incident
 */
@Data
@TableName("act_incident")
public class IncidentPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 事故id
	 */
		@TableId 	@ApiModelProperty(value = "事故id")
	private Long accId;
	/**
	 * 公司id
	 */
		@ApiModelProperty(value = "公司id")
	private Long cmyId;
	/**
	 * 事故名称
	 */
		@ApiModelProperty(value = "事故名称")
	private String accName;
	/**
	 * 事故发生时间
	 */
		@ApiModelProperty(value = "事故发生时间")
	private String accTime;
	/**
	 * 事发地点
	 */
		@ApiModelProperty(value = "事发地点")
	private String accLocation;
	/**
	 * 事故类型
	 */
		@ApiModelProperty(value = "事故类型")
	private Integer accType;
	/**
	 * 事故发生方
	 */
		@ApiModelProperty(value = "事故发生方")
	private String accParty;
	/**
	 * 经济损失
	 */
		@ApiModelProperty(value = "经济损失")
	private Double loss;
	/**
	 * 人员受伤描述
	 */
		@ApiModelProperty(value = "人员受伤描述")
	private String descriptions;
	/**
	 * 现场负责人
	 */
		@ApiModelProperty(value = "现场负责人")
	private String person;
	/**
	 * 现场负责人电话
	 */
		@ApiModelProperty(value = "现场负责人电话")
	private String phone;
	/**
	 * 事发经过
	 */
		@ApiModelProperty(value = "事发经过")
	private String wholeStory;
	/**
	 * 附件地址
	 */
		@ApiModelProperty(value = "附件地址")
	private String accPath;
	/**
	 * 关联员工
	 */
		@ApiModelProperty(value = "关联员工")
	private String employee;
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
