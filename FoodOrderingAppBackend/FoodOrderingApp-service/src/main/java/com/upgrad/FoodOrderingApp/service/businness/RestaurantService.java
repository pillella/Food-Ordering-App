package com.upgrad.FoodOrderingApp.service.businness;

import com.upgrad.FoodOrderingApp.service.dao.CustomerAddressDao;
import com.upgrad.FoodOrderingApp.service.dao.RestaurantDao;
import com.upgrad.FoodOrderingApp.service.entity.RestaurantEntity;
import com.upgrad.FoodOrderingApp.service.entity.StateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RestaurantService {

    //Respective Data access object has been autowired to access the method defined in respective Dao
    @Autowired
    private RestaurantDao restaurantDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public List<RestaurantEntity> getRestaurants() { return restaurantDao.getAllRestaurants(); }

    public RestaurantEntity restaurantByUUID(String someRestaurantId) {
        return null;
    }

    public List<RestaurantEntity> restaurantsByName(String someRestaurantName) {
        return null;
    }

    public List<RestaurantEntity> restaurantByCategory(String someCategoryId) {
        return null;
    }


    public List<RestaurantEntity> restaurantsByRating() {
        return null;
    }

    public RestaurantEntity updateRestaurantRating(RestaurantEntity restaurantEntity, double v) {
        return null;
    }
}
