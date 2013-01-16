package org.agl.lmsmobile.controller;

//import org.agl.lmsmobile.beans.interfaces.IResource;
import org.agl.lmsmobile.beans.interfaces.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.*;

@Controller

public class TestResourceController {
	
	@RequestMapping(value = "/{vno}/tenants/{tenantid}/{resourceid}", method = RequestMethod.GET)
	
	@ResponseBody
	public IResource testAliveNew(@PathVariable("vno") final String vno,
			@PathVariable("tenantid") final String tenantid,
			@PathVariable("resourceid") final String resourceid) {
 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		org.agl.lmsmobile.beans.interfaces.IResource resource = (IResource)ctx.getBean("resource1" + vno);
		resource.execute();
		return (IResource) resource;
	}


}
