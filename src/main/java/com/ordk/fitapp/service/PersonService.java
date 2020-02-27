package com.ordk.fitapp.service;

import com.ordk.fitapp.model.Person;

import java.util.List;

public interface PersonService {
    Person save(Person person);

    List<Person> findAll();
}
