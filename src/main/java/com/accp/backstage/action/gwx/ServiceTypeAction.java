package com.accp.backstage.action.gwx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.backstage.biz.gwx.ServiceTypeBiz;
import com.accp.backstage.dao.gwx.vo.ServiceType;
import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/gwx/c/service")
public class ServiceTypeAction {
	
	@Autowired
	private ServiceTypeBiz stBiz;
	
	@GetMapping("/stclassSel")
	@ResponseBody
	public List<ServiceType> queryServiceType(Integer stclass){
		return stBiz.queryServiceType(stclass);
	}
	
	@GetMapping("/stPidSel")
	@ResponseBody
	public List<ServiceType> queryServiceTypeBystPid(Integer stPid){
		return stBiz.queryServiceTypeBystPid(stPid);
	}
	
 
	@PostMapping("/addSt")
	@ResponseBody
	public Map<String, Object> insertServiceType(String stInfo) {
		ServiceType obj = JSON.parseObject(stInfo, ServiceType.class);
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			stBiz.insertServiceType(obj);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}
	
	@PostMapping("/delSt")
	@ResponseBody
	public Map<String, Object> deleteServiceType(Integer stid) {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			stBiz.deleteServiceType(stid);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}
	
	@PostMapping("/updSt")
	@ResponseBody
	public Map<String, Object> updateServiceType(Integer sort,Boolean display,Integer stid) {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			stBiz.updateServiceType(sort, display, stid);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}
	
	
	@PostMapping("/updStSetting")
	@ResponseBody
	public Map<String, Object> updateServiceTypeSetting(Integer operationTime,Integer confirmTime,Integer violatedNumber,Integer proportion,Boolean toExamine,Integer stid) {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			stBiz.updateServiceTypeSetting(operationTime, confirmTime, violatedNumber, proportion, toExamine, stid);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}
}
