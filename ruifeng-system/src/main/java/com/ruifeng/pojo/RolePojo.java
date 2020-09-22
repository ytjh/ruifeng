package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色表
 * 
 * @author yuanst
 * @date 2020-09-20 22:47:45
 * 表名 sys_role
 */
@Data
@TableName("sys_role")
public class RolePojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色id
	 */
		@TableId 	@ApiModelProperty(value = "角色id")
	private Integer roleId;
	/**
	 * 角色编号
	 */
		@ApiModelProperty(value = "角色编号")
	private String roleCode;
	/**
	 * 角色名称
	 */
		@ApiModelProperty(value = "角色名称")
	private String roleName;
	/**
	 * 排序
	 */
		@ApiModelProperty(value = "排序")
	private Integer subSort;
	/**
	 * 角色状态(0正常 1停用)
	 */
		@ApiModelProperty(value = "角色状态(0正常 1停用)")
	private String status;
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
	 * 是否删除
	 */
		@ApiModelProperty(value = "是否删除")
	private String delFlg;
	/**
	 * 备注
	 */
		@ApiModelProperty(value = "备注")
	private String remark;

}
