package com.accp.backstage.pojo;

import java.util.Date;

public class Complaint {
	private Integer cid;//主键，自增
	private Integer posting;//外键，发帖人编号
	private Integer pcID;//	外键，外键，帖子编号
	private Integer userID;//	外键，投诉人编号
	private Integer ctID;//	外键，投诉类型编号
	private Date TimeOfComplaint;//	举报时间
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
}
