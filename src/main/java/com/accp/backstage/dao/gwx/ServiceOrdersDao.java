package com.accp.backstage.dao.gwx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.backstage.dao.gwx.vo.ServiceOrders;
import com.accp.backstage.dao.gwx.vo.ServiceType;
import com.accp.backstage.pojo.Orders;

public interface ServiceOrdersDao {
	
	/**
	 * 服务预约查询
	 * @return
	 */
	public List<ServiceOrders> queryOrders(@Param("san") String san,@Param("datestart") String datestart,@Param("dateend") String dateend,@Param("stname") String stname,@Param("status") Integer status);

	
	public List<ServiceType> querystname();
}
