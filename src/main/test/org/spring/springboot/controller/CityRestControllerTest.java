package org.spring.springboot.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityRestControllerTest {

    @Autowired
    private CityService cityService;
    
    @Test
    public void findOneCity(){
    	String cityName = "2";
    	City city = cityService.findCityByName(cityName);
    	System.out.println(city.toString());
    }
    @Test
    public void findCityList() {
    	List<City> list = cityService.findCityList();
    	if(list.size()>0) {
    		for(City ci :list) {
    			System.out.println(ci.toString());
    		}
    		assert( list.size()>0);
    	}
    }
    
}
