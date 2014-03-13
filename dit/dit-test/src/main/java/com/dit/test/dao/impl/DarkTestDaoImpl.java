package com.dit.test.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.dit.test.dao.DarkTestDao;

@Repository
public class DarkTestDaoImpl extends SqlSessionDaoSupport implements DarkTestDao{

	public Map getTest() {
		return (Map)getSqlSession().selectOne("getTest");
	}
	
	public List getListTest(){
		return getSqlSession().selectList("getListTest");  
	}
}
