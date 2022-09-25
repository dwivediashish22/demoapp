package com.demoapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demoapp.model.Employee;
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
}
