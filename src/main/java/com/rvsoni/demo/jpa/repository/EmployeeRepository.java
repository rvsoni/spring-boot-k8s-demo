package com.rvsoni.demo.jpa.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.rvsoni.demo.jpa.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer>{
	List<Employee> findAll();
}
