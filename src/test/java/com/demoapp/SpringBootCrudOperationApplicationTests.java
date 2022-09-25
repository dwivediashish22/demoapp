package com.demoapp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.demoapp.repository.EmployeeRepository;
import com.google.gson.Gson;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
public class SpringBootCrudOperationApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	/*
	 * @Test public void contextLoads() { }
	 */

	@Test
	   public void findAllData() {	       //when
		System.out.println("dwivedi");
	       List arrivals = employeeRepository.findAll();
	       System.out.println("ashish");
	       Gson gson = new Gson();
	       String json = gson.toJson(arrivals);///json data convert here in string by using google json library only to print i use there in test cast
	       System.out.println(json);
	       assertThat(arrivals.size()).isGreaterThan(0);//if data in table is present data will be always size grater than 0;
	   }

}
