package com.dit.test.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="head")
public class Head {
	
	public int returnCode = 1;
	public String returnDesc = "";

	public Head() {}
	
	public Head(int returnCode, String returnDesc) {
		this.returnCode = returnCode;
		this.returnDesc = returnDesc;
	}
	
}