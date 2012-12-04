package org.agl.lmsmobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demoMobile")
public class DemoController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String testAlive(@PathVariable String name) {
 
		System.out.println("Yes I am alive " + name);
		return "Hello " + name;
 
	}


}
