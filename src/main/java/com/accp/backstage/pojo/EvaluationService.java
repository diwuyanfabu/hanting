package com.accp.backstage.pojo;

import java.util.Date;

public class EvaluationService {
	private Integer serviceAppraiseID;//服务评价编号，主键，自增
	private Integer serviceID;//服务编号，外键，引用服务表
	private Integer userID;//	用户编号，外键，引用用户表
	private String serviceAppraiseContent;//	内容
	private Date serviceAppraiseDate;//评价时间
	private Integer serviceAppraiseLevel;//星级
	private Integer serviceAppraisePID;//上级编号，0：表示评价，其他：回复评价
}
