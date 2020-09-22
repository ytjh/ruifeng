package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 组织表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:01
 * 表名 sys_org
 */
@Data
@TableName("sys_org")
public class OrgPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组织id
	 */
		@TableId
		@ApiModelProperty(value = "组织id")
	private Integer orgId;
	/**
	 * 区域id
	 */
		@ApiModelProperty(value = "区域id")
	private Integer areaId;
	/**
	 * 父id
	 */
		@ApiModelProperty(value = "父id")
	private Integer pId;
	/**
	 * 组织编号
	 */
		@ApiModelProperty(value = "组织编号")
	private String orgCode;
	/**
	 * 组织名称
	 */
		@ApiModelProperty(value = "组织名称")
	private String orgName;
	/**
	 * 组织简称
	 */
		@ApiModelProperty(value = "组织简称")
	private String orgShortName;
	/**
	 * 注册地址
	 */
		@ApiModelProperty(value = "注册地址")
	private String registerArea;
	/**
	 * 实际地址
	 */
		@ApiModelProperty(value = "实际地址")
	private String actualArea;
	/**
	 * 统一社会信用代码
	 */
		@ApiModelProperty(value = "统一社会信用代码")
	private String creditCode;
	/**
	 * 法人代表
	 */
		@ApiModelProperty(value = "法人代表")
	private String legalPerson;
	/**
	 * 法人代表联系方式
	 */
		@ApiModelProperty(value = "法人代表联系方式")
	private String legalPersonPhone;
	/**
	 * 国民经济行业分类
	 */
		@ApiModelProperty(value = "国民经济行业分类")
	private String tradeType;
	/**
	 * 安全监管行业分类
	 */
		@ApiModelProperty(value = "安全监管行业分类")
	private String safeType;
	/**
	 * 监管部门
	 */
		@ApiModelProperty(value = "监管部门")
	private String supervisionDepartment;
	/**
	 * 网格
	 */
		@ApiModelProperty(value = "网格")
	private String grid;
	/**
	 * 企业经营现状
	 */
		@ApiModelProperty(value = "企业经营现状")
	private String managementStatus;
	/**
	 * 企业规模
	 */
		@ApiModelProperty(value = "企业规模")
	private String scale;
	/**
	 * 企业平面图
	 */
		@ApiModelProperty(value = "企业平面图")
	private String planPic;
	/**
	 * 企业四色风险分布暨应急疏散图
	 */
		@ApiModelProperty(value = "企业四色风险分布暨应急疏散图")
	private String emergencyDispersionPic;
	/**
	 * 大门朝向
	 */
		@ApiModelProperty(value = "大门朝向")
	private String gateDirection;
	/**
	 * 企业东临
	 */
		@ApiModelProperty(value = "企业东临")
	private String eastNear;
	/**
	 * 企业西临
	 */
		@ApiModelProperty(value = "企业西临")
	private String westNear;
	/**
	 * 企业南临
	 */
		@ApiModelProperty(value = "企业南临")
	private String southNear;
	/**
	 * 企业北临
	 */
		@ApiModelProperty(value = "企业北临")
	private String northNear;
	/**
	 * 安全生产标准化等级
	 */
		@ApiModelProperty(value = "安全生产标准化等级")
	private String safeStandardGrade;
	/**
	 * 标准化有效期
	 */
		@ApiModelProperty(value = "标准化有效期")
	private String standardGradeValid;
	/**
	 * 标准化等级证书
	 */
		@ApiModelProperty(value = "标准化等级证书")
	private String standardGradePic;
	/**
	 * 状态
	 */
		@ApiModelProperty(value = "状态")
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
