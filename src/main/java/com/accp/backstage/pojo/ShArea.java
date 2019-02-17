package com.accp.backstage.pojo;
//ShArea(中韩行政地区表)
public class ShArea {
		private Integer areaID;//主键，编号
		private Integer pid ;//递归，父编号
		private String name;//地区名称
		private String mergerName;//地区全称
		private Integer level;//层级012国省市
}
