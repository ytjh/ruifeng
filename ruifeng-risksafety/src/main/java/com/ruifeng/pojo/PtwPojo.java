package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 作业许可表
 * 
 * @author yuanst
 * @date 2020-09-20 23:21:30
 * 表名 act_ptw
 */
@Data
@TableName("act_ptw")
public class PtwPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 作业许可id
	 */
		@TableId 	@ApiModelProperty(value = "作业许可id")
	private Long certId;
	/**
	 * 公司id
	 */
		@ApiModelProperty(value = "公司id")
	private Long cmyId;
	/**
	 * 证书类型
	 */
		@ApiModelProperty(value = "证书类型")
	private Integer certType;
	/**
	 * 证书名称
	 */
		@ApiModelProperty(value = "证书名称")
	private String certName;
	/**
	 * 公司名称
	 */
		@ApiModelProperty(value = "公司名称")
	private String cmyName;
	/**
	 * 部门名称
	 */
		@ApiModelProperty(value = "部门名称")
	private String detName;
	/**
	 * 员工名称
	 */
		@ApiModelProperty(value = "员工名称")
	private String name;
	/**
	 * 发证日期
	 */
		@ApiModelProperty(value = "发证日期")
	private Date starDatetime;
	/**
	 * 到期日期
	 */
		@ApiModelProperty(value = "到期日期")
	private Date endDatetime;
	/**
	 * 附件地址
	 */
		@ApiModelProperty(value = "附件地址")
	private String certUrl;
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
