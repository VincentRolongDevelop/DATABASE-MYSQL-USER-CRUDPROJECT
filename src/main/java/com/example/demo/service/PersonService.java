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
		return (List<Person>)data.findAll();
	}

	@Override
	public Optional<Person> listId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Person p) {
		int res=0;
		Person person = data.save(p);
		if(!person.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}

