package com.accp.backstage.pojo;
//integral积分规格表(干什么事，加多少积分)
public class Integral {
		private Integer integralID;//	主键，自增
		private Integer viceID;//	递归，父编号
		private String integralName;//		规格名称
		private Integer require;//	要求达到此次数,才可以加积分
		private Integer integral;//		积分
		
}
