package com.demo.jpa;

import com.demo.jpa.model.Employee;
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

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        try (Session session = sessionFactory.openSession()) {
            session.getTransaction().begin();
            session.save(emp1);
            session.save(emp2);
            session.getTransaction().commit();
        }
        HibernateUtil.shutdown();

    }
}
