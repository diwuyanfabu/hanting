package com.accp.backstage.pojo;
//function权限表
public class Function {
	private Integer fID;//主键，自增
	private Integer pid;//父编号，0默认
	private String fName;//权限名称
	private String url;//连接路径
}
