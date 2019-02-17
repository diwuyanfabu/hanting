package com.accp.backstage.pojo;

import java.util.Date;

//Trusteeship托管申请表
public class Trusteeship {
		private Integer truID;//主键，自增
		private Integer userID;//外键，用户编号
		private Date applicationTime;//申请时间
		private Integer trusteeshipMonth;//	托管月数
		private Integer auditTime;//审核时间
		private Integer auditStatus;//审核状态(1待审核2审核通过3拒绝)
}
