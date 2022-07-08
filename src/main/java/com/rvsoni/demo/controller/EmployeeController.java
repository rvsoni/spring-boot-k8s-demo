package com.rvsoni.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rvsoni.demo.jpa.entity.Employee;
import com.rvsoni.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Value("${hostname}")
	private String hostName;
	
	@Value("${rvsoni.app.env}")
	private String env;
	
	@Autowired
	private EmployeeService employeeService; 
	
	@RequestMapping(value = "/employee/save", method = RequestMethod.GET)
	public ResponseEntity<ResponseEmployee> saveEmployee(
			@RequestParam(value = "name", required = true) String  name) {
		
		Employee emp = new Employee();
		emp.setName(name);
		
		employeeService.save(emp);
		
		ResponseEmployee re = new ResponseEmployee();
		re.setEmployee(emp);
		re.setEnv(env);
		re.setHostName(hostName);
		
		log.info("Saved " + emp.toString());
		
		return ResponseEntity.ok(re);
	}
	
	@RequestMapping(value = "/employee/list", method = RequestMethod.GET)
	public ResponseEntity<ResponseEmployeeList> listAllEmployee(){
		List<Employee> listEmployees = employeeService.listEmployees();
		
		ResponseEmployeeList rel = new ResponseEmployeeList();
		rel.setEmployees(listEmployees);
		rel.setEnv(env);
		rel.setHostName(hostName);
		
		log.info("Lised " + listEmployees);
		return ResponseEntity.ok(rel);
	}
	
}
