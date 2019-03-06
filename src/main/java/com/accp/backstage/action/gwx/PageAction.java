package com.accp.backstage.action.gwx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gwx/c/page")
public class PageAction {
	
	@GetMapping("/sy")
	public String sy() {
		return "/index.html";
	}

}
