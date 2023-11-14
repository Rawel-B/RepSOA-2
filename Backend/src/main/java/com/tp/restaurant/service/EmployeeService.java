package com.tp.restaurant.service;

import java.util.List;
import com.tp.restaurant.entities.Restaurant;
import com.tp.restaurant.entities.Employee;

public interface EmployeeService
{	
	 Employee saveEmployee(Employee e);
	 Employee updateEmployee(Employee e);
	 void deleteEmployee(Employee e);
     void deleteEmployeeById(Long employeeid);
	 Employee getEmployee(Long employeeid);
	 List<Employee> getAllEmployees();
	 
	 List<Employee> findByEmployeename(String employeename);
	 List<Employee> findByEmployeenameContains(String employeename);
	 List<Employee> findByNameRole (String employeename, String employeerole);
	 List<Employee> findByRestaurant (Restaurant restaurant);
	 List<Employee> findByRestaurantRestaurantid(Long restaurantid);
	 List<Employee> findByOrderByEmployeenameAsc();
	 List<Employee> sortEmployeesNamesRole();
}