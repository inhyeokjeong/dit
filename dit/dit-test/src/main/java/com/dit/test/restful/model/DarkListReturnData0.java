package com.dit.test.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="returnData0")
public class DarkListReturnData0 {

	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}