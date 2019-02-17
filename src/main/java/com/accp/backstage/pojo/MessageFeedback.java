package com.accp.backstage.pojo;

import java.util.Date;

//MessageFeedback留言反馈表
public class MessageFeedback {
		private Integer mfID;//	主键，序号，自增列
		private String mfName;//姓名
		private String mfPhone;//电话
		private String mfEmail;//邮箱	
		private String mfContent;//	内容，具体需求
		private String mfJoinTheWay;//加盟方式
		private Date mfIDmfDate;//留言时间
}
