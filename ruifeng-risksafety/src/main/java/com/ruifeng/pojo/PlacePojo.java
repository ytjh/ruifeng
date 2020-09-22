package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 车间场所表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:17
 * 表名 cmy_place
 */
@Data
@TableName("cmy_place")
public class PlacePojo extends PageVo implements Serializable {
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
	 * 名称
	 */
	@ApiModelProperty(value = "名称")
	private String name;

	/**
	 * 负责人
	 */
	@ApiModelProperty(value = "负责人")
	private String charge;

	/**
	 * 主要作业
	 */
	@ApiModelProperty(value = "主要作业")
	private String mainTask;

	/**
	 * 职业危害场所
	 */
	@ApiModelProperty(value = "职业危害场所")
	private String harmPlace;

	/**
	 * 场所检测报告
	 */
	@ApiModelProperty(value = "场所检测报告")
	private String testReportFile;

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
