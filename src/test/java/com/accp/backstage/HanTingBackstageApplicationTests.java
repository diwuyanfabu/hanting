package com.accp.backstage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accp.backstage.biz.gwx.ServiceTypeBiz;
import com.accp.backstage.dao.gwx.ServiceTypeDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HanTingBackstageApplicationTests {

	@Autowired
	private ServiceTypeBiz stBiz;
	
	
	
	@Test
	public void contextLoads() {
		stBiz.queryServiceType(1);
	}

}

