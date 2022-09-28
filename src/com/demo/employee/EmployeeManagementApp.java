package com.demo.employee;

import java.util.List;
import java.util.Scanner;

import com.demo.models.Employee;
import com.demo.service.EmployeeService;
import com.demo.serviceImpl.EmployeeServiceImpl;

public class EmployeeManagementApp {
	private static char[] allEmployees;
	//MY  EMPLOYEE PROJECT
	public static void main(String[] args)
	{
		int cases=1;
		boolean status = true;
		EmployeeService employeeService=new EmployeeServiceImpl();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 1 to insert Employee");
		System.out.println("Enter 2 to show details of the Employee");
		do {
		cases=sc.nextInt();
		switch(cases) {
		case 1:
			 
			Employee emp=new Employee();
			emp.setEmpId(279);
			emp.setEmpFirstName("KANDUKURI");
			emp.setEmpLastName("AHLAYA");
			emp.setEmpEmailAddress("AKANDUKU@gmail.COM");
			emp.setEmpSalary(300000);
			String insertEmployee=employeeService.insertEmployee(emp);
			System.out.println(insertEmployee);
			break;
		
		case 2:
			List<Employee> allEmployee=employeeService.getAllEmployees();
			System.out.println(allEmployee);
			break;
		}
	}
		while(status);
		sc.close();
}
}
