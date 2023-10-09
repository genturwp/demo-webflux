package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Mono<Person> getPersonById(String id) {
        return personRepository.findById(id);
    }
}
