package org.gradle;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Person.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Person person = (Person) target;
		if (person.getName().equals("Hans")) {
			errors.rejectValue("title", "some.error");
		}
	}
	
	

}
