package com.dit.test.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dit.test.dao.DarkTestDao;
import com.dit.test.service.DarkTestService;


@Service
public class DarkTestServiceImpl implements DarkTestService {

	@Autowired
	private DarkTestDao darkTestDao;

	/**
	 * 리드타임 통계 생성
	 */
	public Map getTest() {
		return darkTestDao.getTest();
	}
	
	public List getListTest(){
		return darkTestDao.getListTest();
	}


}
