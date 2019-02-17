package com.accp.backstage.pojo;
//login登入方式
public class Login {
		private Integer loginID;//主键，自增
		private Integer userID;//外键，用户编号
		private String opentId;//第三方登入成功后返回的一个ID
		private Integer loginType;//登入方式，第三方登入类别(1.邮箱/2.QQ/3.VX/4.微博/5.F啥的)
		private String userEmail;//用户邮箱账号(邮箱登入时用到，默认null)
		private String userPwd;//用户密码(邮箱登入时用到，默认null)
		
		
}
