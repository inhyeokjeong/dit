package com.dit.test.restful.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.dit.test.restful.model.Head;

@XmlRootElement(name="Root")
public class DarkList {
	
	@XmlElement(name="header")
	public Head header;
	
	@XmlElement(name="body")
	public DarkListBody body;
	
	public DarkList() {}
	
	public DarkList(Head header, DarkListBody body) {
		this.header = header;
		this.body = body;
	}
	
}