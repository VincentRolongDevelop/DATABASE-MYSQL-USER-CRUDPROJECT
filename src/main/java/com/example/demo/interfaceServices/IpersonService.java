
package com.example.demo.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Person;

public interface IpersonService {
	
	public List<Person>listar();
	public Optional<Person>listId(int id);
	public int save(Person p);
	public void delete(int id);

}
