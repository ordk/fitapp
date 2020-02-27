package com.ordk.fitapp.service.impl;

import com.ordk.fitapp.dao.PersonDao;
import com.ordk.fitapp.model.Person;
import com.ordk.fitapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public Person save(Person person) {
        return personDao.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
