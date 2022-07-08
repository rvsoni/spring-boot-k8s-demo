package com.rvsoni.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.rvsoni.demo.jpa.entity.Employee;

public class ResponseEmployeeList {

	String hostName;
	
	String env;
		
	List<Employee> employees = new ArrayList<Employee>();

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
