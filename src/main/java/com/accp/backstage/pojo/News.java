package com.accp.backstage.pojo;

import java.util.Date;

//news消息表
public class News {
		private Integer newsID;//	消息编号、主键，自增
		private Integer theSender;//外键，发件人编号
		private Integer addRessee;//外键，收件人编号
		private Integer content;//	内容
		private Date sendingTime;//	发送时间
		private Boolean readState;//是否已读
		private Integer newsType;//	消息类型，1：系统消息，2：站内信
		private Integer messageGroup;//	消息组编号
}
