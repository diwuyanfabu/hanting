package com.accp.backstage.pojo;

import java.util.Date;

//Goldnotes金币流向操作记录表
public class Goldnotes {
	private Integer recordID;	//	记录编号，主键，自增
	private Integer userID;		//外键，用户编号
	private Integer acquisitionMode;//	(1预定服务2服务收益3取消物流订单4其他5充值6线下充值7退款8提现)
	private Date recordDate;	//记录日期
	private String recordDescribe;	//	记录描述
	private Float recordInAndOut;	//记录编号，主键，自增
	private Integer auditStatus;	//审核状态(1待审核2审核成功3未通过)
}
