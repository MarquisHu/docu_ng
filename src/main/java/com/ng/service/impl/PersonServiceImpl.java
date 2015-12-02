package com.ng.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ng.dao.PersonDao;
import com.ng.dto.Person;
import com.ng.service.PersonService;

public class PersonServiceImpl implements PersonService {
	@Resource
	private PersonDao personDao;
	
	public List<Person> getAllPersons() {
		return personDao.findPersons();
	}

	public void addPerson(Person person) {

	}

	public void deletePerson(int id) {

	}
}
