package com.demoapp.service;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoapp.model.Employee;
import com.demoapp.repository.EmployeeRepository;
//defining the business logic
@Service
public class EmployeeService 
{
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
@Autowired
EmployeeRepository employeeRepository;
//getting all employee record by using the method findaAll() of CrudRepository
public List<Employee> getAllEmployees() 
{
	logger.info("EmployeeService : getAllEmployees method invoked : {}");
List<Employee> employee = new ArrayList<Employee>();
employeeRepository.findAll().forEach(employee1 -> employee.add(employee1));
return employee;
}
//getting a specific record by using the method findById() of CrudRepository
public Employee getEmployeesById(int id) 
{
	logger.info("EmployeeService : getEmployeesById method invoked : {}");
return employeeRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Employee employee) 
{
	logger.info("EmployeeService : saveOrUpdate method invoked : {}");
employeeRepository.save(employee);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
	logger.info("EmployeeService : delete method invoked : {}");
employeeRepository.deleteById(id);
}
//updating a record
public void update(Employee employee, int bookid) 
{
	logger.info("EmployeeService : update method invoked : {}");
employeeRepository.save(employee);
}
}