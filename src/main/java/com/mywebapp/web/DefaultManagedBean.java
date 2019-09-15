package com.mywebapp.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.mywebapp.services.DefaultMessageService;

@ManagedBean
public class DefaultManagedBean {

	@ManagedProperty(value="#{defaultMessageService}")
	DefaultMessageService defaultMessageService;
	
	public String getWelcomeMessage() {
		return this.defaultMessageService.getWelcomeMessage();
	}

	public DefaultMessageService getDefaultMessageService() {
		return defaultMessageService;
	}

	public void setDefaultMessageService(DefaultMessageService defaultMessageService) {
		this.defaultMessageService = defaultMessageService;
	}


}
