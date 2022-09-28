package com.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.demo.models.Employee;
import com.demo.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private Object emps;
	List<Employee> emps1 = new ArrayList<Employee>();

	@Override
	public String insertEmployee(Employee emp) {
		this.emps1.add(emp);
		return "Employee Inserted Successfully";
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return  emps1;
	}

}
