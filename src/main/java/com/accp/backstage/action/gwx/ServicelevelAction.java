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

import com.accp.backstage.biz.gwx.ServicelevelBiz;
import com.accp.backstage.pojo.Servicelevel;
import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("/gwx/c/serlvl")
public class ServicelevelAction {
	
	@Autowired
	private ServicelevelBiz serlvBiz;
	
	@GetMapping("/serlvlInfo")
	@ResponseBody
	public List<Servicelevel> queryServicelevel(Integer stid){
		return serlvBiz.queryServicelevel(stid);
	}
	
	@PostMapping("/addserlvl")
	@ResponseBody
	public Map<String, Object> addServicelevel(String lvl){
		Servicelevel obj = JSON.parseObject(lvl, Servicelevel.class);
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			serlvBiz.insertServicelevel(obj);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}
	
	
	@PostMapping("/delserlvl")
	@ResponseBody
	public Map<String, Object> delServicelevel(Integer serlevelID){
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			serlvBiz.delServicelevel(serlevelID);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}
	
	
	@PostMapping("/updserlvl")
	@ResponseBody
	public Map<String, Object> updateServicelevel(Integer serviceIntegralMin,Integer serviceIntegralMax,Integer serlevelID){
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			serlvBiz.updateServicelevel(serviceIntegralMin, serviceIntegralMax, serlevelID);
			json.put("code", "200");
			json.put("msg", "ok");
		} catch (RuntimeException ex) {
			json.put("code", "500");
			json.put("msg", ex.getMessage());
		}
		return json;
	}

}
