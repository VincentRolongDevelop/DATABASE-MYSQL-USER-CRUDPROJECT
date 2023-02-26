
package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceServices.IpersonService;
import com.example.demo.interfaces.IPerson;
import com.example.demo.modelo.Person;

@Service
public class PersonService implements IpersonService {

	@Autowired
	private IPerson data;
	
	@Override
	public List<Person> listar() {
		System.out.println(data.findAll());
		return (List<Person>)data.findAll();
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

