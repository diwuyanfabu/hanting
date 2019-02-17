package com.accp.backstage.pojo;

import java.util.Date;

//integralRecord积分流向操作记录表
public class IntegralRecord {
	private Integer IRID;//记录编号，主键，自增
	private Integer userID;//外键，用户编号
	private Date IRDate;//记录日期
	private String IRDescribe;//记录描述
	private Integer recordInAndOut;//记录积分(-|+)
	private Integer integralID;//外键，积分规格表
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	
}
