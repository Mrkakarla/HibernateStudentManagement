package com.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            Configuration cfg = new Configuration();

            //            cfg.setProperty("hibernate.connection.driver_class", "org.sqlite.JDBC");
            //            cfg.setProperty("hibernate.connection.url", "jdbc:sqlite:students.db");
            //
            //            cfg.setProperty("hibernate.dialect",
            //              "org.hibernate.community.dialect.SQLiteDialect");
            //
            //            cfg.setProperty("hibernate.hbm2ddl.auto", "update");
            //            cfg.setProperty("hibernate.show_sql", "true");

            cfg.setProperty("hibernate.connection.driver_class",
                    "com.mysql.cj.jdbc.Driver");

            cfg.setProperty("hibernate.connection.url",
                    "jdbc:mysql://localhost:3306/hibernate_db?useSSL=false&serverTimezone=UTC");

            cfg.setProperty("hibernate.connection.username", "root");
            cfg.setProperty("hibernate.connection.password", "");

            cfg.setProperty("hibernate.dialect",
                    "org.hibernate.dialect.MySQLDialect");

            // required to auto-create table
            cfg.setProperty("hibernate.hbm2ddl.auto", "update");

            // show SQL in console
            cfg.setProperty("hibernate.show_sql", "true");
            cfg.setProperty("hibernate.format_sql", "true");

            cfg.addAnnotatedClass(Student.class);

            factory = cfg.buildSessionFactory();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}
