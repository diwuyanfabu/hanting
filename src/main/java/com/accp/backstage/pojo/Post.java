package com.accp.backstage.pojo;

import java.util.Date;

public class Post {
	private Integer postID;//主键，自增
	private Integer userID;//用户ID
	private Integer browseNumber;//	浏览数
	private Integer commentNumber;//	评论数
	private Integer fabulousNumber;//	点赞数
	private Integer collectionNumber;//	收藏数
	private Integer fmID;//	外键，论坛板块管理表(里边有帖子类别，也相当于板块类别，填最低层级编号)
	private String title;//	标题
	private String content;//内容
	private Date releaseTime;//发布时间
	private Integer operatingState;//	操作状态(1未删除2已删除)
	private String adminOpinion;//管理员意见
	private Boolean essence;//	加精
	private Boolean solid;//加固
	private Integer majorID;//	外键，专业类别
	private String resourcesPath;//	资源地址
	private String serviceCostTypeID;//	逻辑外键，费用说明
	private Integer integral;//	所需积分
	private Integer goldCoin;//	所需金币
	private String videoPath;//上传视频
	private String coverPath;//视频封面
	private String time;//视频时长(0分0秒)
	private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
	
}
