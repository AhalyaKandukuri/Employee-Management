package com.demo.service;

import java.util.List;

import com.demo.models.Employee;

public interface EmployeeService {
	
	public String  insertEmployee(Employee emp);
    public List<Employee> getAllEmployees();
    

}
