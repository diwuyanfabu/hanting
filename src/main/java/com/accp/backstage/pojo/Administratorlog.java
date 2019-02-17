package com.accp.backstage.pojo;

import java.util.Date;

//Administratorlog管理员日志表
public class Administratorlog {
		private Integer adminlogID;	//主键自增
		private Integer adminID;	//外键，管理员编号
		private String  remarks;	//备注(以“修改了会员，ID：113”的方式记录)
		private Date remarksTime;	//记录时间
		private String remarksIP;	//做出操作的IP地址
}
