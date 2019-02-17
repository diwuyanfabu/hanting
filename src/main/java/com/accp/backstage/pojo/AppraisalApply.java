package com.accp.backstage.pojo;

import java.util.Date;

//AppraisalApply鉴定记录
public class AppraisalApply {
		private Integer applyID;//主键，自增
		private Integer userID;//	外键，用户编号
		private Integer stid;//外键，服务编号
					//自驾游
		private String name;//	姓名
		private Integer sex;//性别(1男2女)
		private Integer height;//身高
		private String constellation;//星座
		private Integer age;//年龄
		private String visaType;//签证类型(直接填字符串)
		private Integer documentType;//	证件类型(1身份证2护照)
		private String certificates;//证件号
		private String experience;//经验时长(直接填字符串)
		private Boolean vehicle;//是否有车
		private Boolean guideCard;//是否有导游证
		private String inKorea;//在韩时长
		private String phone;//联系电话
		private String email;//	邮箱地址
		private String country;//国，在韩住址
		private String provincialID;//省，在韩住址
						//微整形
		private String hospitalLicense;//整形医院营业执照
		private String cooperativeHospital;//	合作医院名字
		private String cooperativeHospitalURL;//合作医院官网网址
		private String hospitalPhone;//	医院联系电话
						//翻译
		private Integer translateType;//翻译资质(上传资质文件类型：1证书 2语言成绩)
		private String translate;//资质文件
		private Boolean office;//是否有办公室
		private String officeCountry;//国，办公室所在地
		private String officeProvince;//省，办公室所在地
		private String officeCity;//市，办公室所在地
		private String officeDetailed;//详细，办公室所在地
		private String koreaLicense;//韩国营业执照
		private String translateWebsite;//	网址
					//学习资源
		private String studyMajor;//所学专业
		private String schoolReport;//成绩单(上传文件)
					//留学中介
		private String officialNetworkURL;//留学中介官网网址
		private String strength;//实力展示
		private Date submitTime;//	提交时间
		private Date cityID;//审核时间
		private String adminOpinion;//	审批备注
		private Integer auditStatus;//审核状态(1待审核2审核成功3未通过)
		
		
}
