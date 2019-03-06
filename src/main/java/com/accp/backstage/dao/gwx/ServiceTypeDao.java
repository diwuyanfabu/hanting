package com.accp.backstage.dao.gwx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.backstage.dao.gwx.vo.ServiceType;

public interface ServiceTypeDao {

	/**
	 * 查询所有服务类别(stclass=0)  或    查找所有一级服务(stclass=1)  或    查找所有一级、二级服务(stclass=2)
	 * @param stPid
	 * @return
	 */
	public List<ServiceType> queryServiceType(@Param("stclass")Integer stclass );
	
	
	/**
	 * 根据父id找子服务
	 * @param stPid
	 * @return
	 */
	public List<ServiceType> queryServiceTypeBystPid(@Param("stPid")Integer stPid );
	
	
	/**
	 * 新增服务类别
	 * @param stInfo
	 */
	public void insertServiceType(@Param("stInfo")ServiceType stInfo);
	
	
	/**
	 * 删除服务类别
	 * @param stid
	 */
	public void deleteServiceType(@Param("stid")Integer stid);
	
	
	/**
	 * 修改服务类别(排序、是否显示)
	 * @param stInfo
	 */
	public void updateServiceType(@Param("sort")Integer sort,@Param("display")Boolean display,@Param("stid")Integer stid);
	
	/**
	 * 修改服务类别(未操作时间、自动确认时间、服务违约天数、违约金比例、是否审核)
	 * @param operationTime
	 * @param confirmTime
	 * @param violatedNumber
	 * @param proportion
	 * @param toExamine
	 * @param stid
	 */
	public void updateServiceTypeSetting(@Param("operationTime")Integer operationTime,@Param("confirmTime")Integer confirmTime,@Param("violatedNumber")Integer violatedNumber,@Param("proportion")Integer proportion,@Param("toExamine")Boolean toExamine,@Param("stid")Integer stid);
}
