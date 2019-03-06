package com.accp.backstage.dao.gwx.vo;

import java.util.Date;

public class ServiceOrders {

	// 服务id
	private Integer serviceid;
	// 订单id
	private String orderid;
	// 用户id
	private Integer userid;
	// 买家
	private String username;
	// 卖家
	private String shopname;
	// 服务类别id
	private Integer stid;
	// 服务类别名称
	private String stname;
	// 服务标题
	private String servicetitle;
	// 积分
	private Integer integral;
	// 下单时间
	private Date ordertime;
	// 订单状态
	private Integer orderStatus;
	// 付款时间
	private Date paymenttime;
	// 备注
	private String remarks;
	// 价格
	private float totalprice;
	// 服务图片
	private String servicecoverimg;
	// 接单时间
	private Date receiptTime;
	// 提供服务时间
	private Date provideServicesTime;
	// 完成时间
	private Date completeTime;

	public Integer getServiceid() {
		return serviceid;
	}

	public void setServiceid(Integer serviceid) {
		this.serviceid = serviceid;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	public String getServicetitle() {
		return servicetitle;
	}

	public void setServicetitle(String servicetitle) {
		this.servicetitle = servicetitle;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getPaymenttime() {
		return paymenttime;
	}

	public void setPaymenttime(Date paymenttime) {
		this.paymenttime = paymenttime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public String getServicecoverimg() {
		return servicecoverimg;
	}

	public void setServicecoverimg(String servicecoverimg) {
		this.servicecoverimg = servicecoverimg;
	}

	public Date getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}

	public Date getProvideServicesTime() {
		return provideServicesTime;
	}

	public void setProvideServicesTime(Date provideServicesTime) {
		this.provideServicesTime = provideServicesTime;
	}

	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	public ServiceOrders(Integer serviceid, String orderid, Integer userid, String username, String shopname,
			Integer stid, String stname, String servicetitle, Integer integral, Date ordertime, Integer orderStatus,
			Date paymenttime, String remarks, float totalprice, String servicecoverimg, Date receiptTime,
			Date provideServicesTime, Date completeTime) {
		super();
		this.serviceid = serviceid;
		this.orderid = orderid;
		this.userid = userid;
		this.username = username;
		this.shopname = shopname;
		this.stid = stid;
		this.stname = stname;
		this.servicetitle = servicetitle;
		this.integral = integral;
		this.ordertime = ordertime;
		this.orderStatus = orderStatus;
		this.paymenttime = paymenttime;
		this.remarks = remarks;
		this.totalprice = totalprice;
		this.servicecoverimg = servicecoverimg;
		this.receiptTime = receiptTime;
		this.provideServicesTime = provideServicesTime;
		this.completeTime = completeTime;
	}

	public ServiceOrders() {
		super();
	}
	
	

}
