package com.accp.backstage.pojo;

import java.util.Date;

public class PostCollection {
	private Integer CollectionID;//主键，自增
	private Integer pcID;//外键，帖子编号
	private Integer userID;//外键，用户编号
	private Date collectionTime;//	收藏时间
}
