package com.artdevs.meetingslog.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Artem L.V. on 09.12.14.
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public String helloWorld () {

		return "hello";
	}

}
