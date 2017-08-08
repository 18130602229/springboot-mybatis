package org.spring.springboot.service.impl;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.dao.CityDao;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityServiceImplTest {


    @Autowired
    private CityDao cityDao;
    @Test
    public void getListCity(){
    	List<City> list = cityDao.findCityList();
    	if(list.size()>0) {
    		for(City ci :list) {
    			System.out.println(ci.toString());
    		}
    		assert( list.size()>0);
    	}
    }
}
