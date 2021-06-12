package com.demo.jpa;

import com.demo.jpa.model.Employee;
import com.demo.jpa.service.EmployeeService;
import com.demo.jpa.service.EmployeeServiceImpl;
import com.demo.jpa.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        
        Employee emp1 = new Employee("Ashish", "S", "ashish.s"); 
        Employee emp2 = new Employee("Rahul", "P", "rahul.p");
        

        EmployeeService employeeService = new EmployeeServiceImpl();

        // employeeService.create(emp1);
        // employeeService.create(emp2);

        // System.out.println(employeeService.findById(1));

        // employeeService.findAll().stream().forEach(System.out::println);

        employeeService.findByFirstName("Ashish").stream().forEach(System.out::println);
        
        HibernateUtil.shutdown();

    }
}
