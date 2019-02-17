package com.accp.backstage.pojo;

import java.util.Date;

public class Services {
	private Integer serviceID;//服务编号，主键，自增
	private Integer stid;//服务类别编号，外键
	private Integer userID;//外键，用户编号
	private Integer resourceID;//资源类别编号
	private String serviceTitle;//服务标题
	private String serviceFuTitle;//服务副标题
	private String downloadTitle;//下载标题
	private Integer servicePrice;//金币价格
	private String serviceCoverImg;//封面图
	private String serviceImgUrlOne;//细节图1
	private String serviceImgUrlTwo;//细节图2
	private String serviceImgUrlThree;//细节图3
	private String serviceImgUrlFour;//细节图4
	private String serviceCostTypeID;//费用说明
	private String serviceIntro;//服务介绍
	private String serviceCity;//服务城市(可填多个)
	private Integer country;//外键，国编
	private Integer serviceCostInclude;//服务费用包含
	private Date serviceStartDate;//可预定日期-起始
	private Date serviceEndDate;//可预定日期-结束
	private String schoolRegion;//学校地区
	private String schoolNameByCN;//学科-中文-学校
	private String majoyNameByCN;//学科-中文-专业
	private String schoolNameByROK;//学科-韩文-学校
	private String majoyNameByROK;//学科-韩文-专业
	private String goodAtMajoy;//擅长专业
	private String hospitalName;//医院名称
	private Integer serviceHour;//小时/天
	private String uploadDataUrl;//上传资料
	private Date releaseTime;//发布时间
	private Integer browseNumber;//浏览数
	private Float weight;//重量
	private Boolean recommendBool;//服务推荐(true推荐)
	private String adminOpinion;//管理员意见
	private Integer shelfState;//上架状态(1上架2下架)
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
}
