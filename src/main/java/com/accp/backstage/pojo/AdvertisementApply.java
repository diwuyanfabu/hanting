package com.accp.backstage.pojo;

import java.util.Date;

public class AdvertisementApply {
	private Integer aaID;//主键，自增
	private Integer userID;//	外键，用户编号
	private Integer aid;//	外键，广告编号
	private String aimgPath;//	图片
	private String apcUrl;//	PC端链接路径
	private String aappUrl;//	手机端链接路径
	private Float price;//	付款金额
	private Integer rentAMonth;//租的月数
	private Date startTime;//开始时间
	private Date endTime;//	结束时间
	private Date applyTime;//	申请时间
	private Date auditTime;//	审核时间
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
}
