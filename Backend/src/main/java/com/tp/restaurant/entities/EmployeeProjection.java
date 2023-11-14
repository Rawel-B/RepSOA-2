package com.tp.restaurant.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "employeename", types = { Employee.class })
public interface EmployeeProjection {
	public String getEmployeename();
}

