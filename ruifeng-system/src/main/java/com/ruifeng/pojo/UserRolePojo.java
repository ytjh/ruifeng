package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户角色表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:01
 * 表名 sys_user_role
 */
@Data
@TableName("sys_user_role")
public class UserRolePojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户角色id
	 */
		@TableId
		@ApiModelProperty(value = "用户角色id")
	private Integer userRoleId;
	/**
	 * 用户id
	 */
		@ApiModelProperty(value = "用户id")
	private Integer userId;
	/**
	 * 角色id
	 */
		@ApiModelProperty(value = "角色id")
	private Integer roleId;

}
