package com.spring.SpringBootH2Project.service.impl;

import com.spring.SpringBootH2Project.dao.EmployeeDAO;
import com.spring.SpringBootH2Project.entity.EmployeeEntity;
import com.spring.SpringBootH2Project.mapper.EmployeeMapper;
import com.spring.SpringBootH2Project.model.Employee;
import com.spring.SpringBootH2Project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDao;

/*    @Autowired
    private Mapper mapper;*/

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public String saveEmployee(Employee employee) {
        EmployeeEntity employeeEntity = employeeMapper.mapEmpToEntity(employee);
        EmployeeEntity emp= employeeDao.save(employeeEntity);
        if(Objects.nonNull(emp)){
            return "Record inserted in DB successfully";
        }
        return "Some Internal server issue please try again";
    }

    @Override
    public List<Employee> fetchEmployeeDetails() {
       List<EmployeeEntity> employeesEntity = (List<EmployeeEntity>) employeeDao.findAll();
       return employeeMapper.mapEmpToEntityList(employeesEntity);
    }

    @Override
    public Employee findEmployeeByID(int empID) {
        Optional<EmployeeEntity> employeeEntityOptional = employeeDao.findById(empID);
        if(employeeEntityOptional.isPresent()){
            return employeeMapper.mapEntityToEmp(employeeEntityOptional.get());
        }
        return null;
    }

    @Override
    public Employee updateEmployeeDetail(Employee employee) {
        if(0 != employee.getEmpID()){
           Optional<EmployeeEntity> employeeEntityOptional =  employeeDao.findById(employee.getEmpID());
           if(employeeEntityOptional.isPresent()){
               EmployeeEntity employeeEntity = employeeMapper.mapEmpToEntity(employee);
               return employeeMapper.mapEntityToEmp(employeeDao.save(employeeEntity));
           }
        }
       return null;
    }

    @Override
    public String  deleteEmployeeByID(int empID) {
        employeeDao.deleteById(empID);
        return "deleted record in DB successfully";
    }

}
