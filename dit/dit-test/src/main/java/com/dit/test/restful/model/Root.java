package com.dit.test.restful.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Root")
public class Root {
	
	@XmlElement(name="header")
	public Head head;
	
	@XmlElement(name="body")
	public Body body;
	
	public Root() {}
	
	public Root(Head head, Body body) {
		this.head = head;
		this.body = body;
	}
	
}