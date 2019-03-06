package com.accp.backstage.dao.gwx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.backstage.pojo.Servicelevel;

public interface ServicelevelDao {
	
	/**
	 * 查询服务级别
	 * @param stid
	 * @return
	 */
	public List<Servicelevel> queryServicelevel(@Param("stid")Integer stid);

	/**
	 * 新增服务级别
	 * @param lvl
	 */
	public void insertServicelevel(@Param("lvl")Servicelevel lvl);
	
	/**
	 * 删除服务级别
	 * @param serlevelID
	 */
	public void delServicelevel(@Param("serlevelID")Integer serlevelID);
	
	/**
	 * 根据id修改服务级别
	 * @param serviceIntegralMin
	 * @param serviceIntegralMax
	 * @param serlevelID
	 */
	public void updateServicelevel(@Param("serviceIntegralMin")Integer serviceIntegralMin,@Param("serviceIntegralMax")Integer serviceIntegralMax,@Param("serlevelID")Integer serlevelID);
	
}
