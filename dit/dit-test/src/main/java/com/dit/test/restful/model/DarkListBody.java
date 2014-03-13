package com.dit.test.restful.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="body")
public class DarkListBody {
	
	@XmlElement(name="DarkList")
	public List<DarkListReturnData0> darkListReturnData0;

	@XmlElement(name="TotalListInfo")
	public DarkListReturnData1 darkListReturnData1;
	
	public DarkListBody() {}
	
	public DarkListBody(List<DarkListReturnData0> darkListReturnData0, DarkListReturnData1 darkListReturnData1) {
		this.darkListReturnData0 = darkListReturnData0;
		this.darkListReturnData1 = darkListReturnData1;
	}
}