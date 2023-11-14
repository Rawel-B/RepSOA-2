package com.tp.restaurant.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.tp.restaurant.entities.Restaurant;
import com.tp.restaurant.entities.Employee;

@RepositoryRestResource(path = "rest")
public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	List<Employee> findByEmployeename(String employeename);
	List<Employee> findByEmployeenameContains(String employeename);   
	
	@Query("select e from Employee e where e.employeename like %:name and e.employeerole > :role")
	List<Employee> findByNameRole (@Param("name") String name,@Param("role") String role);
    
	@Query("select e from Employee e where e.restaurant = ?1")
	List<Employee> findByRestaurant(Restaurant restaurant);
	
	List<Employee> findByRestaurantRestaurantid(Long id);
	
	List<Employee> findByOrderByEmployeenameAsc();
	
	@Query("select e from Employee e order by e.employeename ASC, e.employeerole DESC")
	List<Employee> sortEmployeesNamesRole();
	              
}
