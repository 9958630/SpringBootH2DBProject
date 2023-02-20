package com.spring.SpringBootH2Project.controller;

import com.spring.SpringBootH2Project.model.Employee;
import com.spring.SpringBootH2Project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public String saveEmployeeData(@RequestBody Employee employee){
        if(Objects.nonNull(employee)){
            return employeeService.saveEmployee(employee);
        }else{
            return "Given input details are empty please check";
        }
    }

    @GetMapping("/getEmpDetails")
    public List<Employee> getEmpDetails(){
        return employeeService.fetchEmployeeDetails();
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployeeByID(@PathVariable("id")int empID){
        Employee employee = employeeService.findEmployeeByID(empID);
        if(Objects.nonNull(employee)){
            return employee;
        }
        return null;

    }

    @PatchMapping("/updateEmployee")
    public Employee getUpdateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployeeDetail(employee);
    }

    @DeleteMapping("/employee/{empID}")
    public String deleteEmployee(@PathVariable("empID")int empID){
        return employeeService.deleteEmployeeByID(empID);
    }
}
