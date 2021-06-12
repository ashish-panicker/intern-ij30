package com.demo.jpa.dal;

import java.util.List;

import com.demo.jpa.model.Employee;
import com.demo.jpa.util.HibernateUtil;

import org.hibernate.Session;

public class EmployeeDalImpl implements EmployeeDal {

    @Override
    public void create(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            session.save(employee);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Employee employee) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.getTransaction().begin();
            session.delete(employee);
            session.getTransaction().commit();
        }
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        Employee employee = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employee = session.get(Employee.class, id);
        }
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employees =  session.createQuery("select e from Employee e", Employee.class).list();
        }
        return employees;
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        List<Employee> employees = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            employees =  session.createQuery("select e from Employee e " +
                                                "where e.firstName = :fName", Employee.class)
                                                .setParameter("fName", firstName)
                                                .list();
        }
        return employees;
    }

}
