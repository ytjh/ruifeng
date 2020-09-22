package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 应急处置表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_urgent_treatment
 */
@Data
@TableName("act_urgent_treatment")
public class UrgentTreatmentPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 处置id
	 */
		@TableId 	@ApiModelProperty(value = "处置id")
	private Long disId;
	/**
	 * 警报名称
	 */
		@ApiModelProperty(value = "警报名称")
	private String alarmName;
	/**
	 * 事故类型
	 */
		@ApiModelProperty(value = "事故类型")
	private Integer urgType;
	/**
	 * 发生事故时间
	 */
		@ApiModelProperty(value = "发生事故时间")
	private Date startTime;
	/**
	 * 事故地点
	 */
		@ApiModelProperty(value = "事故地点")
	private String location;
	/**
	 * 报警人
	 */
		@ApiModelProperty(value = "报警人")
	private String disPerson;
	/**
	 * 影响范围
	 */
		@ApiModelProperty(value = "影响范围")
	private Integer urgScope;
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
	 * 应急措施id
	 */
		@ApiModelProperty(value = "应急措施id")
	private Long planId;
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
