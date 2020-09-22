package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 区域表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:02
 * 表名 sys_area
 */
@Data
@TableName("sys_area")
public class AreaPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 区域id
	 */
		@TableId
		@ApiModelProperty(value = "区域id")
	private Integer areaId;
	/**
	 * 区域名称
	 */
		@ApiModelProperty(value = "区域名称")
	private String areaName;
	/**
	 * 区域编码
	 */
		@ApiModelProperty(value = "区域编码")
	private String areaCode;
	/**
	 * 区域父id
	 */
		@ApiModelProperty(value = "区域父id")
	private Integer pId;
	/**
	 * 是否删除
	 */
		@ApiModelProperty(value = "是否删除")
	private String delFlg;
	/**
	 * 修改时间
	 */
		@ApiModelProperty(value = "修改时间")
	private Date updateTime;
	/**
	 * 修改人
	 */
		@ApiModelProperty(value = "修改人")
	private Long updateBy;
	/**
	 * 创建时间
	 */
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 创建人
	 */
		@ApiModelProperty(value = "创建人")
	private Long createBy;
	/**
	 * 备注
	 */
		@ApiModelProperty(value = "备注")
	private String remark;

}
