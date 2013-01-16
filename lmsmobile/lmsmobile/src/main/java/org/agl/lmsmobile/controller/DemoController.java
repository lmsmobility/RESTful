package org.agl.lmsmobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.*;

@Controller
@RequestMapping("/demoMobile")
public class DemoController {
	
	@RequestMapping(value = "/{name}/{date}/{city}", method = RequestMethod.GET)
	
	@ResponseBody
	public String testAlive(@PathVariable("name") final String name,
			@PathVariable("date") final String date,
			@PathVariable("city") final String city) {
 
		System.out.println("Yes " + name + " is alive on " + date + " and staying in " + city);
		return "Yes " + name + " is alive on " + date + " and staying in " + city;
 
	}


}
