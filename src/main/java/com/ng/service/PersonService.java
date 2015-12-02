package com.ng.service;

import java.util.List;

import com.ng.dto.Person;

/**
 * Service to handle Persons.
 */
public interface PersonService {
    List<Person> getAllPersons();

    void addPerson(Person person);

    void deletePerson(int id);
}
