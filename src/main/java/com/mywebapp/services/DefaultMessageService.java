package com.mywebapp.services;

import org.springframework.stereotype.Service;

@Service("defaultMessageService")
public class DefaultMessageService {
	
	private String welcomeMessage = "Benvenuto Spring in JSF!!!";
	
	public DefaultMessageService() {
		
	}
	public String getWelcomeMessage() {
		return this.welcomeMessage;
	}
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	
}
