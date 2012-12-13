package org.agl.lmsmobile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dashboard")
public class LMSDashBoardController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody String getStats(@PathVariable String name, 
			@RequestParam(value="propid", required=true) String propid,
			@RequestParam(value="date", required=true) String date,
			@RequestParam(value="wing", required=false) String wing
			) {
 
		
		return "Hello " + name;
 
	}


}
