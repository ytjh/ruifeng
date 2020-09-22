package com.ruifeng.pojo;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ruifeng.core.plus.PageVo;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 日志表
 * 
 * @author yuanst
 * @date 2020-09-20 22:40:02
 * 表名 sys_log
 */
@Data
@TableName("sys_log")
public class LogPojo extends PageVo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志id
	 */
		@TableId
		@ApiModelProperty(value = "日志id")
	private Integer logId;
	/**
	 * 日志标题
	 */
		@ApiModelProperty(value = "日志标题")
	private String logTitle;
	/**
	 * 日志内容
	 */
		@ApiModelProperty(value = "日志内容")
	private String content;
	/**
	 * 日志类型
	 */
		@ApiModelProperty(value = "日志类型")
	private String logType;
	/**
	 * 方法名称
	 */
		@ApiModelProperty(value = "方法名称")
	private String method;
	/**
	 * 请求URL
	 */
		@ApiModelProperty(value = "请求URL")
	private String url;
	/**
	 * 主机ip
	 */
		@ApiModelProperty(value = "主机ip")
	private String ip;
	/**
	 * 请求参数
	 */
		@ApiModelProperty(value = "请求参数")
	private String param;
	/**
	 * 操作状态
	 */
		@ApiModelProperty(value = "操作状态")
	private String state;
	/**
	 * 错误消息
	 */
		@ApiModelProperty(value = "错误消息")
	private String errorMsg;
	/**
	 * 操作时间
	 */
		@ApiModelProperty(value = "操作时间")
	private Date operTime;
	/**
	 * 操作员id
	 */
		@ApiModelProperty(value = "操作员id")
	private Long operId;
	/**
	 * 操作员姓名
	 */
		@ApiModelProperty(value = "操作员姓名")
	private String operName;
	/**
	 * 操作地点
	 */
		@ApiModelProperty(value = "操作地点")
	private String location;

}
