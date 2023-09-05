package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.model.Employee;

public interface Employeeservice {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getallEmployee();
	
	void deleteemployee(long empid);
	
	Employee updateEmployee(Employee employee);

}
