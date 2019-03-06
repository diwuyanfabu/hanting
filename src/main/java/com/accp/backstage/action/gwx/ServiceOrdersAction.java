package com.accp.backstage.action.gwx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.backstage.biz.gwx.ServiceOrdersBiz;
import com.accp.backstage.dao.gwx.vo.ServiceOrders;
import com.accp.backstage.dao.gwx.vo.ServiceType;
import com.accp.backstage.pojo.Orders;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/gwx/c/serOrders")
public class ServiceOrdersAction {
	
	@Autowired
	private ServiceOrdersBiz serOdBiz;
	
	@GetMapping("/queryallorder")
	@ResponseBody
	public PageInfo<ServiceOrders> queryallorder(String san,String datestart,String dateend,String stname,Integer status,Integer PageNum,Integer PageSize) throws Exception {
		if(san==null||san=="") {
			san=null;
		}
		if(stname==null) {
			stname="不限";
		}
		return serOdBiz.queryallorder(san, datestart, dateend, stname, status, PageNum, PageSize);
	}
	
	@GetMapping("/getstname")
	@ResponseBody
	public List<ServiceType> getServiceTypeAtOne(){
		return serOdBiz.querystname();
	}

}
