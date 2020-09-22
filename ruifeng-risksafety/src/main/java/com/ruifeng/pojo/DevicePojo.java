package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 公司设备表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:17
 * 表名 cmy_device
 */
@Data
@TableName("cmy_device")
public class DevicePojo extends PageVo implements Serializable {
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
	 * 所在车间id
	 */
	@ApiModelProperty(value = "所在车间id")
	private Integer placeId;

	/**
	 * 名称
	 */
	@ApiModelProperty(value = "名称")
	private String name;

	/**
	 * 编号
	 */
	@ApiModelProperty(value = "编号")
	private String number;

	/**
	 * 购买日期
	 */
	@ApiModelProperty(value = "购买日期")
	private Date purchaseDate;

	/**
	 * 所需资金
	 */
	@ApiModelProperty(value = "所需资金")
	private Double spendMoney;

	/**
	 * 分类
	 */
	@ApiModelProperty(value = "分类")
	private String type;

	/**
	 * 检验检测有效期
	 */
	@ApiModelProperty(value = "检验检测有效期")
	private String testTerm;

	/**
	 * 设备现状
	 */
	@ApiModelProperty(value = "设备现状")
	private String actualStatus;

	/**
	 * 负责人
	 */
	@ApiModelProperty(value = "负责人")
	private Integer chargeUserId;

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

	/**
	 * 创建人
	 */
	@ApiModelProperty(value = "创建人")
	private String createBy;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	/**
	 * 修改人
	 */
	@ApiModelProperty(value = "修改人")
	private String updateBy;

	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private Date updateTime;

}
