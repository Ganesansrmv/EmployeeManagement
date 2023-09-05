package com.employeemanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.*;
//import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Empid")
	private long empid;

	// @NotNull(message = "Empname shout not be null")
	@Column(name = "Empname")
	private String empname;

	// @NotNull(message = "Emp Addresss shout not be null")
	@Column(name = "Empaddress")
	private String empaddress;

	public Employee() {
		super();
	}

	@Column(name = "Empdepartment")
	private String empdepartment;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getEmpdepartment() {
		return empdepartment;
	}

	public void setEmpdepartment(String empdepartment) {
		this.empdepartment = empdepartment;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empdepartment="
				+ empdepartment + "]";
	}

}
