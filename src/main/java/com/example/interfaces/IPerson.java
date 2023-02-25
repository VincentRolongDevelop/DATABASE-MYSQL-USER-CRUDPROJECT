package com.example.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.example.modelo.Person;

public interface IPerson extends CrudRepository<Person, Integer>{
	  
}
