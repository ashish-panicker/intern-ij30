package com.demo.jpa.dal;

import java.util.List;

import com.demo.jpa.model.Employee;

public interface EmployeeDal {

    void create(Employee employee);

    void delete(Employee employee);

    Employee findEmployeeById(Integer id);

    List<Employee> findAll();

    List<Employee> findByFirstName(String firstName);
    
}
