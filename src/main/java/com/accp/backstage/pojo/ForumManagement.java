package com.accp.backstage.pojo;
//ForumManagement论坛板块管理(帖子类别)
public class ForumManagement {
		private Integer fmID;//	主键，自增
		private Integer pid;//	pid递归编号
		private Integer sort;//	排序
		private Integer fmName;//栏目名称
		private Boolean auditStatus;//	审核(true需要审核false不需要审核)
		private Boolean giftIntegral;//	赠送积分(true赠送false不赠送)
		private Integer adminID;//版主
		private Integer serviceCopies;//	服务份数，用作韩语翻译
		//自驾游：服务价格*天数*人数，微整形：服务价格*人数，留学中介：服务价格*人数，韩语翻译：份数*服务价格，学习资源：服务价格
}
