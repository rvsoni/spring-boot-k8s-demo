package com.rvsoni.demo.controller;

import com.rvsoni.demo.jpa.entity.Employee;

public class ResponseEmployee {

	String hostName;
	
	String env;
		
	Employee employee;

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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
