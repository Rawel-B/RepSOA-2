package com.tp.restaurant;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.tp.restaurant.entities.Restaurant;
import com.tp.restaurant.entities.Employee;
import com.tp.restaurant.repos.EmployeeRepository;

@SpringBootTest
class EmployeesApplicationTests
{
 	@Test
	void contextLoads()
    {
	
    }
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	 public void testCreateEmployee() {
		Employee emp = new Employee("Hank","Sous Chef",new Date());
		employeeRepository.save(emp);
	}	
	
	   @Test
		public void testFindEmployee()
		 {
			 Employee p = employeeRepository.findById(2L).get();		  
			 System.out.println(p);
		 }

		@Test
		public void testUpdateEmployee()
		 {
			 Employee p = employeeRepository.findById(2L).get();
			 p.setEmployeerole("Server");
			 employeeRepository.save(p);
		 }
		
		
	@Test
		public void testDeleteEmployee()
		 {
			 employeeRepository.deleteById(1L);;
			 
		 }

	   
	@Test
		public void testListAllEmployees()
		 {
			 List<Employee>  emps = employeeRepository.findAll();	 
				for (Employee e : emps)
				{
					System.out.println(e);
				}	 
		 }
	
	@Test
	public void testFindBy()
	 {
	List<Employee>  emps = employeeRepository.findByEmployeename("John");
			for (Employee e : emps)
			{
				System.out.println(e);
			}
		
	 }
	
	@Test
	public void testFindByEmployeenameContains ()
	 {
	List<Employee> emps=employeeRepository.findByEmployeenameContains("J");
			for (Employee e : emps)
			{
				System.out.println(e);
			} 
	}
	
	@Test
	public void testfindByNameRole()
		 {
		List<Employee>  emps = employeeRepository.findByNameRole("John", "Server");
			for (Employee e : emps)
				{
					System.out.println(e);
				}
			
		 }
	
	@Test
	public void testfindByRestaurant()
	 {
		Restaurant res = new Restaurant();
		res.setRestaurantid(1L);			
		List<Employee>  emps = employeeRepository.findByRestaurant(res);
			for (Employee e : emps)
			{
				System.out.println(e);
			}
	 }
	
	@Test
	public void findByRestaurantRestaurantid()
		 {			
			List<Employee>  emps = employeeRepository.findByRestaurantRestaurantid(1L);
				for (Employee e : emps)
				{
					System.out.println(e);
				}
	       }
	
	@Test
	public void testfindByOrderByEmployeenameeAsc()
	 {
		List<Employee>  prods =    employeeRepository.findByOrderByEmployeenameAsc();	 
			for (Employee e : prods)
			{
				System.out.println(e);
			}
	 }
	
	@Test
	public void testsortEmployeesNameRole()
	 {
		List<Employee>  emps = employeeRepository.sortEmployeesNamesRole();	 
			for (Employee p : emps)
			{
				System.out.println(p);
			}
	 }

}