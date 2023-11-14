package com.tp.restaurant.RESTControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tp.restaurant.entities.Employee;
import com.tp.restaurant.service.EmployeeService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeeRESTController
{
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	 } 		
	
	@RequestMapping(value="/{employeeid}",method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("employeeid") Long employeeid) {	
		return employeeService.getEmployee(employeeid);
    }
	
	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@RequestMapping(value="/{employeeid}",method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("employeeid") Long employeeid)
	{
		employeeService.deleteEmployeeById(employeeid);
	}
	
	@RequestMapping(value="/EmployeeRes/{restaurantid}",method = RequestMethod.GET)
	public List<Employee> getEmployeeByRestaurantid(@PathVariable("restaurantid") Long restaurantid) {
		return employeeService.findByRestaurantRestaurantid(restaurantid);
	 }

	@RequestMapping(value="/empsByName/{employeename}",method = RequestMethod.GET)
	public List<Employee> findByEmployeeNameContains(@PathVariable("employeename") String employeename) {
	 return employeeService.findByEmployeeNameContains(employeename);
	}

}
