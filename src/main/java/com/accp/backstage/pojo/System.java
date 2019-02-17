package com.accp.backstage.pojo;
//system系统配置表
public class System {
		private Integer sysID;//主键，自增
		private Integer exchangeRate;//金币汇率
		private Integer charge;//	收费比例
		private Integer signIn;//签到获得积分
		private Integer postIntegral;//	发帖获得积分
		private Integer track;//跟帖获得积分
		private Integer releaseBeauty;//发布美妆获得积分
		private Integer logisticMin;//普通会员物流重量
		private Integer logisticMinSeller;//商家会员物流重量
		private Integer logisticWeight;//上门取货物流重量
		private Integer logisticPrice;//	单价/kg
		private Float bond;//保证金
		private Integer videoSize;//视频大小/MB
		private Integer closeorderdays;//订单下单未付款，n天后自动关闭，0为不自动关闭
		private Integer receivedays;//订单完成后，n天后自动确认服务，0为不自动确认服务
		private Integer refunddays;//	订单完成后，用户在n天内可以发起退款申请，设置0天不允许完成订单退款
		private Integer refundconfirmdays;//用户发起退款申请后，订单退款申请几天后自动确认
		private Boolean shopFreeStatus;//是否开启店铺免费体验模式
		private Integer freeTime;//	店铺免费体验月数
}
