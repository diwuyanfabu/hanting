package com.accp.backstage.pojo;

import java.util.Date;

//Putforward提现表
public class Putforward {
		private Integer pfID;//主键，自增
		private Integer userID;//外键，用户IDc
		private String putName;//	提现人姓名
		private Integer bankID;//银行类别
		private String bankAccount;//银行账号
		private String openBankName;//	开户行
		private Date submitTime;//提交申请时间
		private Date auditTime;//主键，自增
		private Float money;//提现金额
		private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
}
