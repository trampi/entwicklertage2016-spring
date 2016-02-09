package org.gradle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


	private PersonRepository repository;
	private EntityManager entityManager;

	@Autowired
	public PersonController(PersonRepository repository, EntityManager entityManager) {
		this.repository = repository;
		this.entityManager = entityManager;
	}
	
	@RequestMapping
	public List<Person> getAllPersons() {
		//return entityManager.createQuery("select p from Person p where p.name = 'Walter'")
		return repository.findByName("Walter");
	}
	
}
