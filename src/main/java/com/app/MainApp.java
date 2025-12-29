package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {

    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.setName("Ajay");
        s.setCity("Delhi");
        s.setDeptNo(10);

        session.persist(s);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully");
    }
}