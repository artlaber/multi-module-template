package org.artdevs.projectname.web.controllers;

import org.artdevs.projectname.facades.FacadeComponent;
import org.artdevs.projectname.services.ServiceComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Artem L.V. on 09.12.14.
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

	@Autowired
	FacadeComponent facadeComponent;

	@Autowired
	ServiceComponent serviceComponent;

	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld (final Model model) {

		String message = facadeComponent.getMessage() + "<br>" + serviceComponent.getMessage();

		model.addAttribute("customMessage", message);
		return "hello";
	}
}
