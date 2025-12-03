package com.example.demospringboot.service;

import com.example.demospringboot.entity.Person;

public abstract class PersonService {

    public abstract Person findByNoHP(int noHP);

    public abstract boolean existsByNoHP(int noHP);

    public abstract Person save(Person person);

}
