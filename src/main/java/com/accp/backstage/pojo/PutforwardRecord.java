package com.accp.backstage.pojo;

import java.util.Date;

//PutforwardRecord提现记录表
public class PutforwardRecord {
		private Integer pfrID;//主键，自增
		private Integer userID;//	外键，用户ID
		private String bankAccount;//	银行账号
		private Integer bankID;//	外键，银行类别
		private Date submitTime;//	提交申请时间
		private Date completeTime;//完成审核时间
		private Float money;//提现金额
		private String adminOpinion;//审批备注
}
