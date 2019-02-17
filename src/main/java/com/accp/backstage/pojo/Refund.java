package com.accp.backstage.pojo;

import java.util.Date;

public class Refund {
	private Integer refundID;//退款编号、主键，自增
	private Integer point;//退款申请指向，1：商家，2：管理员
	private String orderID;//外键，订单编号
	private Integer userID;//外键，用户编号
	private String refundReason;//退款原因
	private String refundExplain;//退款说明
	private String refundImg;//退款附带图片
	private Float applyRefundMoney;//申请退款金额
	private Float ActualRefundMoney;//实际退款金额
	private Date applicationTime;//申请时间
	private String businessRemarks;//商家审核备注
	private Date auditTime;//商家审核时间
	private Integer auditStatus;//商家审核状态(1待审核2审核成功3未通过)
	private String adminRemarks;//管理员审核备注
	private Date adminTime;//管理员审核时间
	private Integer adminStatus;//管理员审核状态(1待审核2审核成功3未通过)
}
