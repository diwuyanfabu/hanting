package com.accp.backstage.pojo;

import java.util.Date;

public class MerchantCollection {
	private Integer collectID;//收藏编号，主键，自增
	private Integer userID;//用户编号，外键，引用用户表
	private Integer merchantOrServiceByID;//商家编号
	private Integer collectType;//收藏类别
	private Date collectionTime;//收藏时间
}
