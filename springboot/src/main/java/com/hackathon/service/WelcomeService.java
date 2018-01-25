package com.hackathon.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		return "Welcome Suomi 100!";
	}

	public String retrieveUpdateMessage() {
		return "Update should happen";
	}

	public String retrieveRemoveMessage() {
		return "Remove should happen";
	}
}