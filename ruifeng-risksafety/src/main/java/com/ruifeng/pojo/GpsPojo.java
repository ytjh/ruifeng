package com.ruifeng.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定位数据表
 * 
 * @author xzj
 * @date 2020-09-21 16:42:17
 * 表名 cmy_gps
 */
@Data
@TableName("cmy_gps")
public class GpsPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@ApiModelProperty(value = "编号")
	private Integer id;

	/**
	 * 定位点位类型
	 */
	@ApiModelProperty(value = "定位点位类型")
	private String type;

	/**
	 * 关联的实体id
	 */
	@ApiModelProperty(value = "关联的实体id")
	private Integer objectId;

	/**
	 * 经度
	 */
	@ApiModelProperty(value = "经度")
	private String longitude;

	/**
	 * 纬度
	 */
	@ApiModelProperty(value = "纬度")
	private String latitude;

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
