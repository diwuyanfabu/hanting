package com.accp.backstage.pojo;

import java.util.Date;

public class BrowseRecords {
	private Integer brID;//	主键，自增
	private Integer brType;//浏览类别(1服务浏览2帖子浏览)
	private Integer userID;//	外键，用户编号
	private Integer postID;//	外键，帖子编号
	private Integer serviceID;//	外键，服务编号
	private Date browseTime;//	浏览时间

}
