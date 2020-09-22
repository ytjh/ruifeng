package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色菜单表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:01
 * 表名 sys_role_menu
 */
@Data
@TableName("sys_role_menu")
public class RoleMenuPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色菜单id
	 */
		@TableId
		@ApiModelProperty(value = "角色菜单id")
	private Integer sysRoleId;
	/**
	 * 角色id
	 */
		@ApiModelProperty(value = "角色id")
	private Integer roleId;
	/**
	 * 菜单id
	 */
		@ApiModelProperty(value = "菜单id")
	private Integer menuId;

}
