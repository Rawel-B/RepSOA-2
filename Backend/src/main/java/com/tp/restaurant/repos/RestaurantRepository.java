package com.tp.restaurant.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.tp.restaurant.entities.Restaurant;

@RepositoryRestResource(path = "res")
@CrossOrigin(origins = "http://localhost:4200/") 
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>
{

}
