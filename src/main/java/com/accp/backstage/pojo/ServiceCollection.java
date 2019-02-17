package com.accp.backstage.pojo;

import java.util.Date;

//ServiceCollection服务收藏(商品收藏)
public class ServiceCollection {
		private Integer serColleID;//	主键，自增
		private Integer serviceID;//外键，服务编号(商品表)
		private Integer userID;//	外键，用户编号
		private Date collectionTime;//收藏时间
}
