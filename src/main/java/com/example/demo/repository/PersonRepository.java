package com.example.demo.repository;

import com.example.demo.domain.Person;
import reactor.core.publisher.Mono;

public interface PersonRepository {

    public Mono<Person> findById(String id);
}
