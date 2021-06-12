package com.demo.jpa.service;

import java.util.List;

import com.demo.jpa.dal.EmployeeDal;
import com.demo.jpa.dal.EmployeeDalImpl;
import com.demo.jpa.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDal employeeDal = new EmployeeDalImpl();

    @Override
    public void create(Employee employee) {
        employeeDal.create(employee);
        
    }

    @Override
    public void delete(Employee employee) {
        employeeDal.delete(employee);
        
    }

    @Override
    public Employee findById(Integer id) {
        return employeeDal.findEmployeeById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDal.findAll();
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        return employeeDal.findByFirstName(firstName);
    }

}
