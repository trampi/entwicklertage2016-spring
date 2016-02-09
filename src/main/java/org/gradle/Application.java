package org.gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
public class Application extends RepositoryRestMvcConfiguration {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
