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

	private EntityManager entityManager;

	@Autowired
	public PersonController(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@RequestMapping
	public List<Person> getAllPersons() {
		TypedQuery<Person> query
				= entityManager.createQuery("select p from Person p", Person.class);
		return query.getResultList();
	}
	
}
