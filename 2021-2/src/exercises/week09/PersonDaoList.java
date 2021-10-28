package exercises.week09;

import java.util.*;

public class PersonDaoList implements PersonDao {
	List<Person> persons;
		
	public PersonDaoList() {
		persons = new ArrayList<Person>();
	}

	@Override
	public void insert(Person p) {
		persons.add(p);
	}

	@Override
	public List<Person> findAll() {
		return persons;
	}

	@Override
	public Person findById(int id) {
		for (Person pi : persons)
			if(pi.getId() == id)
				return pi;
		return null;
	}

	@Override
	public void update(int id, Person p) {
		Person person = findById(id);
		if (person != null) {	
			person.setName(p.getName());	
			person.setAddress(p.getAddress());	
		}	
	}

	@Override
	public void delete(int id) {
		Person person = findById(id);
		if (person != null) {
			persons.remove(person);
		}
	}

	@Override
	public void delete(Person p) {
		persons.remove(p);
	}
}
