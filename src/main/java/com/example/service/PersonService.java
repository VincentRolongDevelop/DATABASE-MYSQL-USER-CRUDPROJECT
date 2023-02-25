package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.interfaceServices.IpersonService;
import com.example.interfaces.IPerson;
import com.example.modelo.Person;

public class PersonService implements IpersonService {

	@Autowired
	private IPerson data;
	
	@Override
	public List<Person> list() {
		return (List<Person >)data.findAll();
	}

	@Override
	public Optional<Person> listId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}