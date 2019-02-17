package com.accp.backstage.pojo;

import java.util.Date;

//ServiceReporting商家举报表
public class ServiceReporting {
	private Integer srID;//主键，自增
	private Integer businessID;//外键，商家编号
	private Integer serviceID;//外键，商家发布服务编号
	private Integer userID;//外键，举报人编号
	private Integer ctID;//外键，举报类别编号
	private Date TimeOfComplaint;//举报时间
	private Date auditTime;//	审核时间
	private Date auditStatus;//	审核状态(1待审核2审批通过3审批未通过)
}
