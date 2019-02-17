package com.accp.backstage.pojo;

import java.util.Date;

public class Bond {
	private Integer bID;//主键，自增
	private Integer userID;//用户ID
	private Integer bondType;//获取方式(1充值2线下充值)
	private Float goldCoin;//操作(-100|+100)
	private String reviewNotes;//审核备注
	private Date submitTime;//提交申请时间
	private Date completeTime;//完成审核时间
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
}
