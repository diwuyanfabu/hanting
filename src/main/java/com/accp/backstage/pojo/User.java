package com.accp.backstage.pojo;

import java.util.Date;

public class User {
	private Integer userID;//用户编号
	private String userImgPath;//用户头像地址(第三方注册成功后复制过来)
	private String userName;//用户名(第三方注册成功后复制过来)
	private String userRealName;//用户真实姓名
	private Integer userSex;//用户性别，1：男，2：女
	private String userPhone;//联系电话
	private String contactMailbox;//联系邮箱
	private Float userMoney;//用户金币
	private Integer userIntegral;//用户积分
	private Integer country;//外键，国编
	private Integer provincialID;//外键，省级地址编号
	private Integer cityID;//外键，市级地址编号
	private Integer countyID;//外键，县/区级地址编号
	private String adDetail;//地址详情
	private Integer merchantType;//商家类别，0：不是商家，1：大陆商家用户，2：海外商家用户
	private Date merchantRegistrationTime;//商家注册时间
	private Integer firstServiceID;//第一个服务类别编号，外键，引用服务类型表
	private Integer secondServiceID;//第二个服务类别编号，外键，引用服务类型表
	private Float firstServiceMoney;//第一个服务交易额
	private Float secondServiceMoney;//第二个服务交易额
	private String hospitalName;//医院名称，申请服务类别有微整形时不能为空，否则可以
	private String shopName;//店铺名称
	private String signature;//店铺签名
	private Float guaranteeMoney;//店铺保证金
	private String shopImg;//商家店铺图片路径
	private Integer identityType;//证件类型，海外用户为空，大陆商家用户：1：身份证号码，2：护照号码
	private String identityNumder;//证件号码
	private String identityRealName;//海外证件真实姓名，大陆商家用户为空
	private String identityPositiveImg;//证件正面图片路径
	private String identityNegativeImg;//证件反面图片路径
	private String identityHandImg;//证件手持图片路径
	private String languageNameText;//服务语言
	private String majorNameText;//擅长专业
	private Integer liveCityID;//所在城市编号
	private String merchantEmail;//商家联系邮箱
	private String merchantPhone;//商家联系电话
	private Float merchantLevel;//商家星级
	private Integer merchantExp;//商家经验值，用来提升星级
	private String qq;//QQ
	private String weChat;//微信
	private String profession;//职业
	private Float height;//身高
	private String constellation;//星座
	private Integer age;//年龄
	private String selfIntroduction;//自我介绍
	private Integer collectCount;//商家被收藏数
	private Integer orderCount;//商家被订单数
	private Integer browseNumber;//商家被浏览数
	private Boolean trusteeship;//托管状态
	private Date trusteeshipStartTime;//托管开始时间
	private Integer trusteeshipMonth;//托管月数
	private Integer businessState;//营业状态(1营业2暂停3关闭)
	private Integer experience;//免费体验月数
	private Boolean experienceStatus;//免费体验状态(true开启false关闭)
	private Integer auditStatus;//审核状态(1待审核2已通过3拒绝)
	private String reason;//管理员理由
	private Boolean authentication;//一号服务平台认证
	private Boolean authenticationer;//二号服务平台认证
	private Integer creditScore;//信誉积分(默认60/满分100 20为1颗星)
	private Boolean stateboolean;//用户状态(可禁用用户true1正常false0禁用)
	private Boolean mailboxVerification;//邮箱验证/邮箱激活
	private String registerIP;//注册IP地址
	private String lastEntry;//最后登入IP地址
	private Date userRegistrationTime;//用户注册时间
	private Date recentEntry;//用户最后登入时间
}
