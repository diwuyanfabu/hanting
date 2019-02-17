package com.accp.backstage.pojo;
//serviceDes服务描述表
public class ServiceDes {
		private Integer serviceDesID;//	服务描述编号，主键，自增
		private String serviceDesTitle;//	服务描述标题
		private String serviceDesContentIOUrl;//服务描述内容文件路径
		private Integer serviceID;//服务编号，外键，引用服务表
		
}
