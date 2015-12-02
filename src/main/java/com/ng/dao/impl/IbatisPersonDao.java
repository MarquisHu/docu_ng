package com.ng.dao.impl;

import java.util.List;

import com.ng.dao.BaseDao;
import com.ng.dao.PersonDao;
import com.ng.dto.Person;

public class IbatisPersonDao extends BaseDao implements PersonDao {
	private static final String NAMESPACE = "com.ng.dao.PersonDao.";
	
	@SuppressWarnings("unchecked")
	public List<Person> findPersons() {
		return (List<Person>) getSqlSessionTemplate().selectList(NAMESPACE + "findPersons");
	}
}
