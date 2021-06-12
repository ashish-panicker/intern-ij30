package com.demo.jpa.service;

import java.util.List;

import com.demo.jpa.model.Employee;

public interface EmployeeService {


    void create(Employee employee);

    void delete(Employee employee);

    Employee findById(Integer id);

    List<Employee> findAll();

    List<Employee> findByFirstName(String firstName);
    
}
