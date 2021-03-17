package com.nagarro.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien
{
	@Id
	private int employeeCode;
	private String employeeName;
	private String location;
	private String email;
	private String dateOfBirth;
	
	public Alien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alien(int employeeCode, String employeeName, String location, String email, String dateOfBirth) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.location = location;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Alien [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", location=" + location
				+ ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
