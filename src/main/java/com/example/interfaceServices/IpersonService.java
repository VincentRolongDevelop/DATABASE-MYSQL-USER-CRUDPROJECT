
package com.example.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.modelo.Person;

public interface IpersonService {
	
	public List<Person>list();
	public Optional<Person>listId(int id);
	public int save(Person p);
	public void delete(int id);

}
