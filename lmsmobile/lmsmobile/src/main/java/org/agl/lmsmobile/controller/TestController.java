package org.agl.lmsmobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/testMobile")
public class TestController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String testAlive(@PathVariable String name) {
 
		System.out.println("Yes I am alive " + name);
		return "Hello " + name;
 
	}


}
