package com.accp.backstage.pojo;

import java.util.Date;

//Advertisement广告位表
public class Advertisement {
		private Integer aid;//	主键，自增(前台模块放ID，匹配后台广告)
		private Integer atid;//	外键，广告位模块编号
		private String atitle;//标题
		private Integer aorder;//排序
		private String aimgPath;//图片路径
		private String apcUrl;//PC端链接路径
		private String aappUrl;//手机端链接路径
		private Boolean state;//广告位状态(已租/未租)
		private Date startTime;//	开始时间
		private Integer rentAMonth;//租的月数
		private Float price;//价格(单价/月)
		private String adescribe;//	描述
}
