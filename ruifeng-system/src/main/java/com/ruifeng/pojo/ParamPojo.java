package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 参数表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:02
 * 表名 sys_param
 */
@Data
@TableName("sys_param")
public class ParamPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 参数id
	 */
		@TableId
		@ApiModelProperty(value = "参数id")
	private Integer paramId;
	/**
	 * 参数编码
	 */
		@ApiModelProperty(value = "参数编码")
	private String paramCode;
	/**
	 * 参数值
	 */
		@ApiModelProperty(value = "参数值")
	private Integer paramValue;
	/**
	 * 参数名称
	 */
		@ApiModelProperty(value = "参数名称")
	private String paramName;
	/**
	 * 创建人
	 */
		@ApiModelProperty(value = "创建人")
	private Long createBy;
	/**
	 * 创建时间
	 */
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 修改人
	 */
		@ApiModelProperty(value = "修改人")
	private Long updateBy;
	/**
	 * 修改时间
	 */
		@ApiModelProperty(value = "修改时间")
	private Date updateTime;
	/**
	 * 备注
	 */
		@ApiModelProperty(value = "备注")
	private String remark;
	/**
	 * 是否删除
	 */
		@ApiModelProperty(value = "是否删除")
	private String delFlg;

}
