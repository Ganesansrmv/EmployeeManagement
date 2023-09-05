package com.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeemanagement.model.Employee;

@Repository
public interface Employeerepo extends JpaRepository<Employee,Long > {

}
