package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 人员证书表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:02
 * 表名 sys_credential
 */
@Data
@TableName("sys_credential")
public class CredentialPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 证书id
	 */
		@TableId
		@ApiModelProperty(value = "证书id")
	private Integer credentialId;
	/**
	 * 用户id
	 */
		@ApiModelProperty(value = "用户id")
	private Integer userId;
	/**
	 * 证书名称
	 */
		@ApiModelProperty(value = "证书名称")
	private String credentialName;
	/**
	 * 证书有效期开始
	 */
		@ApiModelProperty(value = "证书有效期开始")
	private Date credentialValidityBegin;
	/**
	 * 证书有效期结束
	 */
		@ApiModelProperty(value = "证书有效期结束")
	private Date credentialValidityEnd;
	/**
	 * 证书图片路径
	 */
		@ApiModelProperty(value = "证书图片路径")
	private String credentialUrl;

}
