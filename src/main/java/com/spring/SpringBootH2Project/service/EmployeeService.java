package com.spring.SpringBootH2Project.service;

import com.spring.SpringBootH2Project.entity.EmployeeEntity;
import com.spring.SpringBootH2Project.model.Employee;

import java.util.List;

public interface EmployeeService {

    String saveEmployee(Employee employee);

    List<Employee> fetchEmployeeDetails();

    Employee findEmployeeByID(int empID);

    Employee updateEmployeeDetail(Employee employee);

    String deleteEmployeeByID(int empID);
}
