package com.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.model.Employee;
import com.employeemanagement.repo.Employeerepo;

@Service
public class Employeeserviceimpl implements Employeeservice {

	@Autowired
	private Employeerepo employeerepo;

	@Override
	public Employee saveEmployee(Employee employee) {

		return employeerepo.save(employee);
	}

	@Override
	public List<Employee> getallEmployee() {

		return employeerepo.findAll();
	}

	@Override
	public void deleteemployee(long empid) {

		employeerepo.deleteById(empid);

	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeerepo.save(employee);
	}

}
