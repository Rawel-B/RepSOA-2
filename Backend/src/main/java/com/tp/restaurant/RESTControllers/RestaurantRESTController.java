package com.tp.restaurant.RESTControllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tp.restaurant.entities.Restaurant;
import com.tp.restaurant.repos.RestaurantRepository;

@RestController
@RequestMapping("/api/res")
@CrossOrigin("*")
public class RestaurantRESTController
{
    @Autowired
    RestaurantRepository restaurantRepository;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Restaurant> getAllRestaurants()
    {
        return restaurantRepository.findAll();
    }
    
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Restaurant getRestaurantById(@PathVariable("id") Long id)
    {
        return restaurantRepository.findById(id).get();
    }
}