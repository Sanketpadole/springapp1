package com.hello.springapp.Service;

import org.springframework.http.HttpStatus;

import com.hello.springapp.Model.Employee;

public interface EmployeeService {

	HttpStatus saveEmployee(Employee employee, HttpStatus created);

	Employee saveEmployee(Employee employee);

	

	

}
