package com.hello.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hello.springapp.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
