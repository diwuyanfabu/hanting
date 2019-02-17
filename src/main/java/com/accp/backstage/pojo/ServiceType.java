package com.accp.backstage.pojo;
//serviceType服务类别表
public class ServiceType {
		private Integer stid;//	主键，自增
		private Integer stPid;//递归编号(父ID)
		private String stName;//服务名称
		private Integer sort;//	排序(层次作用 默认0 0是一级服务 以此类推)
		private Boolean display;//是否显示
		private Integer operationTime;//未操作时间
		private Integer confirmTime;//自动确认时间
		private Integer violatedNumber;//	服务违约天数
		private Integer proportion;//违约金比例
		private Boolean toExamine;//是否审核tinyint(1)
		private String advertisement;//	广告图片地址
}
