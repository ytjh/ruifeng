package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 菜单表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:02
 * 表名 sys_menu
 */
@Data
@TableName("sys_menu")
public class MenuPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜单id
	 */
		@TableId
		@ApiModelProperty(value = "菜单id")
	private Integer menuId;
	/**
	 * 菜单名称
	 */
		@ApiModelProperty(value = "菜单名称")
	private String menuName;
	/**
	 * 父菜单ID
	 */
		@ApiModelProperty(value = "父菜单ID")
	private Integer pId;
	/**
	 * 菜单路径
	 */
		@ApiModelProperty(value = "菜单路径")
	private String url;
	/**
	 * 菜单类型
	 */
		@ApiModelProperty(value = "菜单类型")
	private String menuType;
	/**
	 * 菜单图标
	 */
		@ApiModelProperty(value = "菜单图标")
	private String icon;
	/**
	 * 排序
	 */
		@ApiModelProperty(value = "排序")
	private Integer sort;
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
