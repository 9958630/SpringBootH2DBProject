package com.spring.SpringBootH2Project.dao;

import com.spring.SpringBootH2Project.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends CrudRepository<EmployeeEntity,Integer> {
}
