package org.spring.springboot.controller;

import java.util.List;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
    	System.out.println("cityName:"+cityName);
        return cityService.findCityByName(cityName);
    }
    @RequestMapping(value = "/cityList", method = RequestMethod.GET)
    public List<City> findCityList() {
        return cityService.findCityList();
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findOneCity() {
        return "hell world!!!";
    }
}
