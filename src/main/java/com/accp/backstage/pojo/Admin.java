package com.accp.backstage.pojo;

import java.util.Date;
//admin管理员表
public class Admin {
		private Integer adminID;	//自增，主键
		private Integer adminType;	//管理员类别(1超级管理员2普通管理员)
		private String  name;		//管理员账号
		private String password;	//管理员密码
		private Date creationTime;	//创建时间
		private Integer roleID;		//外键，角色编号
		private String creationIP;	//创建IP
		private Integer founder;	//创建人编号
		private Date recentEntry;	//用户最后登入时间
		private String IP;			//最后登入IP地址
		
}
