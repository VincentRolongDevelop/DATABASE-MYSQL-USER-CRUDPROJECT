
package com.example.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.Person;

@Repository
public interface IPerson extends CrudRepository<Person, Integer>{
	  
}

