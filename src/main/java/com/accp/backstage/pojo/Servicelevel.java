package com.accp.backstage.pojo;
//Servicelevel(服务级别表)
public class Servicelevel {
		private Integer serlevelID;//主键，自增
		private String serlevelName;//级别名称(交易额度达到了要求可以更换称号)
		private Integer stid;//	外键，服务类别(一级服务)
		private Integer serviceIntegralMin;//	最低积分
		private Integer serviceIntegralMax;//	最大积分
}
