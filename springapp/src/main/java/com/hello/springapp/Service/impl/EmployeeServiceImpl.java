package com.hello.springapp.Service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.hello.springapp.Model.Employee;
import com.hello.springapp.Repository.EmployeeRepository;
import com.hello.springapp.Service.EmployeeService;

@Service

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository=employeeRepository;
		
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
		
	}
	@Override
	public HttpStatus saveEmployee(Employee employee, HttpStatus created) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
