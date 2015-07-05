package com.dit.test.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="darkInput")
public class DarkInputParam {
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
