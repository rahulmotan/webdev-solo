package com.example.webdevsolo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webdev.models.Hello;

public interface HelloRepository extends CrudRepository<Hello, Integer> {

}
