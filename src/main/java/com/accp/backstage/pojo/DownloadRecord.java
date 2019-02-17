package com.accp.backstage.pojo;

import java.util.Date;

//DownloadRecord下载记录表(用于-论坛资源下载记录)
public class DownloadRecord {
		private Integer drID;//	主键，自增
		private Integer userID;//外键，用户编号
		private Integer postID;//	外键，帖子编号
		private Date downloadTime;//	下载时间
}
