package com.example.demo.repository;

import com.example.demo.domain.Person;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.time.LocalDate;


@Component
public class PersonRepositoryImpl implements PersonRepository{
    @Override
    public Mono<Person> findById(String id) {
        return Mono.just(new Person("123", "gentur", LocalDate.now()));
    }
}
