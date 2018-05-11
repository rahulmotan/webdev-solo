package com.example.webdevsolo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdevsolo.models.Hello;

public interface HelloRepository extends CrudRepository<Hello, Integer> {

}
