package com.amruta.SpringBootDemo.dao;

import com.amruta.SpringBootDemo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDAO {

    int insertPersonByID(UUID id, Person person);
    List<Person> getAllPerson();
    int deletePersonById(UUID id);
    Optional<Person> getPersonById(UUID id);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPersonByID(id, person);
    };
}
