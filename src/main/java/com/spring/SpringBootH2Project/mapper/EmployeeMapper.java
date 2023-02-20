package com.spring.SpringBootH2Project.mapper;

import com.spring.SpringBootH2Project.entity.EmployeeEntity;
import com.spring.SpringBootH2Project.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.WARN, componentModel = "spring")
public interface EmployeeMapper {


   EmployeeEntity mapEmpToEntity(Employee employee);


   List<Employee> mapEmpToEntityList(List<EmployeeEntity> employeeEntities);

   Employee mapEntityToEmp(EmployeeEntity employeeEntity);
}
