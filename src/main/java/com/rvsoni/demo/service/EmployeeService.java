package com.rvsoni.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rvsoni.demo.jpa.entity.Employee;
import com.rvsoni.demo.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> listEmployees() {
		return employeeRepository.findAll();
	}
}
