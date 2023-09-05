package com.employeemanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.service.Employeeserviceimpl;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private Employeeserviceimpl empserimpl;

	@PostMapping
	public Employee saveemployee(@RequestBody Employee emp) {

		return empserimpl.saveEmployee(emp);
	}

	@GetMapping
	public List<Employee> getallemployee() {
		return empserimpl.getallEmployee();
	}

	@DeleteMapping("/{empid}")
	public ResponseEntity<String> deleteemployee(@PathVariable Long empid) {

		empserimpl.deleteemployee(empid);
		// return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		return ResponseEntity.ok("Record Deleted");
	}

	@PutMapping("/{empid}")
	public ResponseEntity<Employee> updateemployee(@PathVariable int empid, Employee employee) {
		employee.setEmpid(empid);
		return new ResponseEntity<Employee>(empserimpl.updateEmployee(employee), HttpStatus.OK);
	}

}
