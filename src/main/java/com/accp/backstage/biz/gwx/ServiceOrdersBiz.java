package com.accp.backstage.biz.gwx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.backstage.dao.gwx.ServiceOrdersDao;
import com.accp.backstage.dao.gwx.vo.ServiceOrders;
import com.accp.backstage.dao.gwx.vo.ServiceType;
import com.accp.backstage.pojo.Orders;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
public class ServiceOrdersBiz {
	
	@Autowired
	private ServiceOrdersDao serOr;
	
	public PageInfo<ServiceOrders> queryallorder(String san,String datestart,String dateend,String stname,Integer status,Integer PageNum,Integer PageSize){
		PageHelper.startPage(PageNum, PageSize);
		return new PageInfo<ServiceOrders>(serOr.queryOrders(san, datestart, dateend, stname, status));
	}
	
	public List<ServiceType> querystname(){
		return serOr.querystname();
	}

}
