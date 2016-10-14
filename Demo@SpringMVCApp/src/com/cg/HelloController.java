package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET)
//	@ResponseBody
	public String sayHello(ModelMap map){
//	TODO	PREPARE MODEL
		String message = "Hello, world!";
		map.addAttribute("msg",message);
		
//	TODO	SELECT VIEW	
		return "hello";
	}
	
	
}
