package com.css.java.dto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Company {
	private String companyID;
	private Address empAddress;
	private Employee emp;
	private HashMap<Integer, Employee> employeeHash;
	
	
	// constructor
	public Company(String companyID, Address empAddress, Employee emp, HashMap<Integer, Employee> employeeHash) {
		super();
		this.companyID = companyID;
		this.empAddress = empAddress;
		this.emp = emp;
		this.employeeHash = employeeHash;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	// getters and setters

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public HashMap<Integer, Employee> getEmployeeHash() {
		return employeeHash;
	}

	public void setEmployeeHash(HashMap<Integer, Employee> employeeHash) {
		this.employeeHash = employeeHash;
	}

	@Override
	public String toString() {
		return "Company [companyID=" + companyID + ", empAddress=" + empAddress + ", emp=" + emp + ", employeeHash="
				+ employeeHash + "]";
	}

}