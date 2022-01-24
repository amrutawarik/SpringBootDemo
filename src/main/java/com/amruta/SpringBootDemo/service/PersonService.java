package com.amruta.SpringBootDemo.service;

import com.amruta.SpringBootDemo.dao.PersonDAO;
import com.amruta.SpringBootDemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDAO") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int insertPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPerson() {
        return personDAO.getAllPerson();
    }

    public Optional<Person> getPersonById(UUID id){
        return personDAO.getPersonById(id);
    }

    public void deletePersonById(UUID id){
        personDAO.deletePersonById(id);
    }
}
