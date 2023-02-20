package com.spring.SpringBootH2Project.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private int empID;

    @Column
    private String empName;
    @Column
    private String empAddr;
    @Column
    private String empEmailID;
    @Column
    private String empMobNumber;
    @Column
    private String empFatherName;
    @Column
    private String companyName;
    @Column
    private int salary;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddr() {
        return empAddr;
    }

    public void setEmpAddr(String empAddr) {
        this.empAddr = empAddr;
    }

    public String getEmpEmailID() {
        return empEmailID;
    }

    public void setEmpEmailID(String empEmailID) {
        this.empEmailID = empEmailID;
    }

    public String getEmpMobNumber() {
        return empMobNumber;
    }

    public void setEmpMobNumber(String empMobNumber) {
        this.empMobNumber = empMobNumber;
    }

    public String getEmpFatherName() {
        return empFatherName;
    }

    public void setEmpFatherName(String empFatherName) {
        this.empFatherName = empFatherName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
