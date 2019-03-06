package com.accp.backstage.biz.gwx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.backstage.dao.gwx.ServiceTypeDao;
import com.accp.backstage.dao.gwx.vo.ServiceType;

@Service
@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true)
public class ServiceTypeBiz {
	
	@Autowired
	private ServiceTypeDao stDao;
	
	public List<ServiceType> queryServiceType(Integer stclass){
		return stDao.queryServiceType(stclass);
	}
	
	public List<ServiceType> queryServiceTypeBystPid(Integer stPid){
		return stDao.queryServiceTypeBystPid(stPid);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public void insertServiceType(ServiceType stInfo) {
		stDao.insertServiceType(stInfo);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public void deleteServiceType(Integer stid) {
		stDao.deleteServiceType(stid);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public void updateServiceType(Integer sort,Boolean display,Integer stid) {
		stDao.updateServiceType(sort, display, stid);
	}
	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
	public void updateServiceTypeSetting(Integer operationTime,Integer confirmTime,Integer violatedNumber,Integer proportion,Boolean toExamine,Integer stid) {
		stDao.updateServiceTypeSetting(operationTime, confirmTime, violatedNumber, proportion, toExamine, stid);
	}

}
