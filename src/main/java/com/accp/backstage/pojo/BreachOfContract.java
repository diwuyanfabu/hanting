package com.accp.backstage.pojo;
//BreachOfContract(违约规格)
public class BreachOfContract {
		private Integer bcID;//	主键，自增
		private Integer stid;//外键，服务类别(一级服务)
		private Integer operationTime;//未确认时间(单位/天)
		private Integer confirmationTime;//	自动确认时间(单位/小时)
		private Integer BreachOfContractTime;//违约时间(单位/天)
		private Integer confirmationMoney;//	违约金(百分比)
}
