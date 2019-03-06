package com.accp.backstage.biz.gwx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.backstage.dao.gwx.ServicelevelDao;
import com.accp.backstage.pojo.Servicelevel;

@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,readOnly=false)
public class ServicelevelBiz {
	
	@Autowired
	private ServicelevelDao serldao;
	
	@Transactional(propagation=Propagation.SUPPORTS,isolation=Isolation.READ_COMMITTED,readOnly=true)
	public List<Servicelevel> queryServicelevel(Integer stid){
		return serldao.queryServicelevel(stid);
	}

	public void insertServicelevel(Servicelevel lvl) {
		serldao.insertServicelevel(lvl);
	}
	
	public void delServicelevel(Integer serlevelID) {
		serldao.delServicelevel(serlevelID);
	}
	
	public void updateServicelevel(Integer serviceIntegralMin,Integer serviceIntegralMax,Integer serlevelID) {
		serldao.updateServicelevel(serviceIntegralMin, serviceIntegralMax, serlevelID);
	}
}
