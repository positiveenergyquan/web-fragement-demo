package org.xdemo.example.site.web.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ConfigurableWebApplicationContext;

@Controller
@RequestMapping("/system/")
public class SystemController {

	@Resource ConfigurableWebApplicationContext wac;
	
	/**
	 * 更新web配置
	 * @return
	 */
	@ResponseBody
	@RequestMapping("update")
	public String update(){
		wac.refresh();
		return "updating";
	}
	
}
