package com.tp.restaurant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tp.restaurant.entities.Restaurant;
import com.tp.restaurant.entities.Employee;
import com.tp.restaurant.repos.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee e) {
		return employeeRepository.save(e);
		
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return employeeRepository.save(e);
		
	}

	@Override
	public void deleteEmployee(Employee e) {
		employeeRepository.delete(e);

	}

   @Override
	public void deleteEmployeeById(Long employeeid) {
		employeeRepository.deleteById(employeeid);
		
	}

	@Override
	public Employee getEmployee(Long employeeid) {
		return  employeeRepository.findById(employeeid).get();
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
    @Override
	public List<Employee> findByEmployeename(String employeename) {
		return employeeRepository.findByEmployeename(employeename);
	}

	@Override
	public List<Employee> findByEmployeenameContains(String employeename) {
		return employeeRepository.findByEmployeenameContains(employeename);
	}

	@Override
	public List<Employee> findByNameRole(String employeename, String employeerole) {
		return employeeRepository.findByNameRole(employeename,employeerole);
	}
	
	@Override
	public List<Employee> findByRestaurant(Restaurant restaurant) {
		return employeeRepository.findByRestaurant(restaurant);
	}

	@Override
	public List<Employee> findByRestaurantRestaurantid(Long restaurantid) {
		return employeeRepository.findByRestaurantRestaurantid(restaurantid);
	}

	@Override
	public List<Employee> findByOrderByEmployeenameAsc() {
		return employeeRepository.findByOrderByEmployeenameAsc();
	}

	@Override
	public List<Employee> sortEmployeesNamesRole() {
		return employeeRepository.sortEmployeesNamesRole();
	}


}
