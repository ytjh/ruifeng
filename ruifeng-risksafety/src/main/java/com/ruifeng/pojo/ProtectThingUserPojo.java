package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 防护用品人员关联表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:16
 * 表名 cmy_protect_thing_user
 */
@Data
@TableName("cmy_protect_thing_user")
public class ProtectThingUserPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(value = "编号")
	private Integer id;

	/**
	 * 企业id
	 */
	@ApiModelProperty(value = "企业id")
	private Integer companyId;

	/**
	 * 防护用品id
	 */
	@ApiModelProperty(value = "防护用品id")
	private Integer protectThingId;

	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private Integer userId;

}
