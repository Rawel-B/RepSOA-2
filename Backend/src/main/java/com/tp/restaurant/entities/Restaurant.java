package com.tp.restaurant.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="restaurant")
public class Restaurant
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long restaurantid;
	private String restaurantname;
	private String restaurantaddress;
	private String restaurantphone;
	private String restaurantemail;
	private String restaurantwebsite;
	
	@OneToMany(mappedBy = "restaurant")
	@JsonIgnore
	private List<Employee> employees;
	

}
