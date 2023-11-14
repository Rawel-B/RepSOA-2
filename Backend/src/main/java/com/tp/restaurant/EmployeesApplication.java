package com.tp.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.tp.restaurant.entities.Employee;
import com.tp.restaurant.entities.Restaurant;

@SpringBootApplication
public class EmployeesApplication implements CommandLineRunner 
{
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args)
	{
		SpringApplication.run(EmployeesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Employee.class,Restaurant.class);
		
	}


}