package com.luxoft.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Objects;

public class App {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/app-context.xml");

        System.out.println("Hello World!");

        Dao dao = (Dao) context.getBean("dao");

        System.out.println("\n\n");
        System.out.println(dao.getNumber(1));
        System.out.println("\n\n");

        List<Contact> contacts = dao.getAll();
        for (Contact contact : contacts) {
            System.out.println(contact);
            for (Phone phone : contact.getPhones()) {
                System.out.println(phone);
            }
            System.out.println("********");
        }

    }
}
