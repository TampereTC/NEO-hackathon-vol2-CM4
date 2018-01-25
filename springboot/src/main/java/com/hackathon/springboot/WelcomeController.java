package com.hackathon.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.service.WelcomeService;

@RestController
public class WelcomeController {

	//Auto wiring
	@Autowired
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
		@RequestMapping(value = "/welcome/", method = RequestMethod.POST)
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

	@RequestMapping(value = "/create/", method = RequestMethod.PUT)
	public String create() {
		return service.retrieveWelcomeMessage();
	}

	@RequestMapping(value = "/update/", method = RequestMethod.POST)
	public String update() {
		return service.retrieveUpdateMessage();
	}
	
	@RequestMapping(value = "/remove/", method = RequestMethod.DELETE)	
	public String remove() {
		return service.retrieveRemoveMessage();
	}
}