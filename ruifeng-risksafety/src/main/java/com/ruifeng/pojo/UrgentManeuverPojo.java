package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 应急演习表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:29
 * 表名 act_urgent_maneuver
 */
@Data
@TableName("act_urgent_maneuver")
public class UrgentManeuverPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 演习id
	 */
		@TableId 	@ApiModelProperty(value = "演习id")
	private Integer manId;
	/**
	 * 公司id
	 */
		@ApiModelProperty(value = "公司id")
	private Integer cmyId;
	/**
	 * 事故编码
	 */
		@ApiModelProperty(value = "事故编码")
	private String code;
	/**
	 * 演习名称
	 */
		@ApiModelProperty(value = "演习名称")
	private String manName;
	/**
	 * 演习时间
	 */
		@ApiModelProperty(value = "演习时间")
	private Date manTime;
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
