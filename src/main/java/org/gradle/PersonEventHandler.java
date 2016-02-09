package org.gradle;

import javax.annotation.Resource;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class PersonEventHandler {

	@Resource
	private PersonRepository personRepository;

	@HandleBeforeCreate
	public void setDefaultValues(Person person) {
		person.setName(person.getName() + " Event");
	}
	
}
