package com.dit.test.restful.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="returnData1")
public class DarkListReturnData1 {
	
	/**
	 * 리스트 총 페이지 수
	 */
	public int totalPageNum;
	
	/**
	 * 리스트 총 리스트 수
	 */
	public int totalListCount;
		
	public DarkListReturnData1() {}
	
	public DarkListReturnData1(int totalPageNum, int totalListCount) {
		this.totalPageNum = totalPageNum;
		this.totalListCount = totalListCount;
	}
	
}