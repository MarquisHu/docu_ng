package com.ng.dao;

import java.util.List;

import com.ng.dto.Person;

public interface PersonDao {
	List<Person> findPersons();
}
