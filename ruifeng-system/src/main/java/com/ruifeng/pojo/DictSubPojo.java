package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 字典子表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:02
 * 表名 sys_dict_sub
 */
@Data
@TableName("sys_dict_sub")
public class DictSubPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 字典子表id
	 */
		@TableId
		@ApiModelProperty(value = "字典子表id")
	private Integer subDictId;
	/**
	 * 字典id
	 */
		@ApiModelProperty(value = "字典id")
	private Integer dictId;
	/**
	 * 值
	 */
		@ApiModelProperty(value = "值")
	private String subDictValue;
	/**
	 * 名称
	 */
		@ApiModelProperty(value = "名称")
	private String subDictName;
	/**
	 * 排序
	 */
		@ApiModelProperty(value = "排序")
	private Integer subSort;
	/**
	 * 创建人
	 */
		@ApiModelProperty(value = "创建人")
	private Long createBy;
	/**
	 * 创建时间
	 */
		@ApiModelProperty(value = "创建时间")
	private Date createTime;
	/**
	 * 修改人
	 */
		@ApiModelProperty(value = "修改人")
	private Long updateBy;
	/**
	 * 修改时间
	 */
		@ApiModelProperty(value = "修改时间")
	private Date updateTime;
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
