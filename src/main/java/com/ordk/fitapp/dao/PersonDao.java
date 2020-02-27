package com.ordk.fitapp.dao;

import com.ordk.fitapp.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonDao extends CrudRepository<Person, Long> {
    Person save(Person person);
    List<Person> findAll();
}
