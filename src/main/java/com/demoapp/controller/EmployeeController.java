package com.demoapp.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoapp.model.Employee;
import com.demoapp.service.EmployeeService;
//mark class as Controller
@RestController
public class EmployeeController 
{
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
//autowire the EmployeeService class
@Autowired
EmployeeService employeeService;
//creating a get mapping that retrieves all the Employees detail from the database 
@GetMapping("/Employee")
private List<Employee> getAllEmployees() 
{
	logger.info("EmployeeController : getAllEmployees method invoked : {}");
return employeeService.getAllEmployees();
}
//creating a get mapping that retrieves the detail of a specific Employee
@GetMapping("/Employee/{employeeid}")
private Employee getEmployees(@PathVariable("employeeid") int employeeid) 
{
	logger.info("EmployeeController : getEmployees method invoked : {}");
return employeeService.getEmployeesById(employeeid);
}
//creating a delete mapping that deletes a specified Employee
@DeleteMapping("/Employee/{Employeeid}")
private void deleteEmployee(@PathVariable("Employeeid") int Employeeid) 
{
	logger.info("EmployeeController : deleteEmployee method invoked : {}");
employeeService.delete(Employeeid);
}
//creating post mapping that post the Employee detail in the database
@PostMapping("/employees")
private Employee saveEmployee(@RequestBody Employee employees) 
{
	logger.info("EmployeeController : saveEmployee method invoked : {}");
employeeService.saveOrUpdate(employees);
return employees;
}
//creating put mapping that updates the Employee detail 
@PutMapping("/employees")
private Employee update(@RequestBody Employee employees) 
{
	logger.info("EmployeeController : update method invoked : {}");	
employeeService.saveOrUpdate(employees);
return employees;
}
}
