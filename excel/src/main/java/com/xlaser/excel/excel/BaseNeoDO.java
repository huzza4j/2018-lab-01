package com.xlaser.excel.excel;

import java.io.Serializable;

import lombok.Data;

/**
 * <p>
 * model: 父类属性
 * </p>
 *
 * @package: com.xlaser.excel.excel
 * @author: Elijah.D
 * @time: CreateAt 2018/11/19 && 9:49
 * @description: 模型, 通用父类
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@Data
public abstract class BaseNeoDO implements Serializable {
	private static final long serialVersionUID = 2090859342042139331L;

	/**
	 * 主键
	 */
	//@Id
	//@GeneratedValue(strategy = CustomIdStrategy.class)
	private String id;

	/**
	 * 作业id
	 */
	private Long jobId;

	/**
	 * 作业名称
	 */
	private String jobName;

	/**
	 * 元数据名称
	 */
	private String metaName;

	/**
	 * 数据库类型
	 */
	private Integer configType;

	/**
	 * db 名字
	 */
	private String dbName;

	/**
	 * IP
	 */
	private String host;

	/**
	 * 端口
	 */
	private String port;

	/**
	 * 上下文路径
	 */
	private String contextPath;

	/**
	 * 生效时间
	 */
	private Long createAt;

	/**
	 * 更新时间
	 */
	private Long updateAt;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 修改者
	 */
	private String updateBy;

	/**
	 * 版本号记录
	 */
	private Integer version;
}
