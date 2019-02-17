package com.accp.backstage.pojo;

import java.util.Date;

public class Orders {
	private String orderID;//订单编号，主键，算法生成
	private Integer userID;//外键，用户编号
	private Integer serviceID;//外键，商品编号(服务编号)
	private Integer resouroeID;//外键，资源类别
	private Integer orderType;//发货方式(1自发2上门取货)
	private Date orderTime;//下单时间
	private Date paymentTime;//付款时间
	private Date receiptTime;//接单时间
	private Date provideServicesTime;//提供服务时间
	private Date completeTime;//完成时间
	private String remarks;//备注
	private Date scheduledStartTime;//用户预定开始时间
	private Date scheduledEndTime;//用户预定结束时间
	private Integer population;//人数
	private Integer number;//份数
	private Float smallPlan;//小计
	private Float totalPrice;//订单总价
	private String uploadPath;//上传文件路径
	private Double weight;//订单重量
	private Integer integral;//订单积分
	private Integer collectGoods;//外键，收货地址
	private Integer AddressID;//外键，发货地址
	private Integer orderStatus;//订单状态(1待付款2待接单3待提供服务4已提供服务6服务完成6服务取消7未接单8已退款)
	private Integer commentstatus;//评论状态(1待评价2用户已评3双方已评)
	private Integer refundstatus;//退款状态(1退款申请中2不同意3申请管理员介入4管理员拒绝5退款完成6退款取消)
	private Integer filesatus;//文档状态(1待提供文档2商家已上传文档)
	private String documentpath;//韩语翻译文档文件路径
}
