package com.tp.restaurant.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeid;
	private String employeename;
	private String employeerole;
	private Date employeehiredate;
	
	@ManyToOne
	private Restaurant restaurant;	

	public Employee()
	{
		super();
	}

	public Employee(String employeename, String employeerole, Date employeehiredate)
	{
		this.employeename = employeename;
		this.employeerole = employeerole;
		this.employeehiredate = employeehiredate;
	}

	public void setEmployeeid(Long employeeid) {
		this.employeeid = employeeid;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public void setEmployeerole(String employeerole) {
		this.employeerole = employeerole;
	}

	public void setEmployeehiredate(Date employeehiredate) {
		this.employeehiredate = employeehiredate;
	}

	public Long getEmployeeid() {
		return employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public String getEmployeerole() {
		return employeerole;
	}

	public Date getEmployeehiredate() {
		return employeehiredate;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeerole="
				+ employeerole + ", employeehiredate=" + employeehiredate + ", restaurant=" + restaurant + "]";
	}

}
