package com.dit.test.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface DarkTestService {

	Map getTest();
	
	List getListTest();

}
