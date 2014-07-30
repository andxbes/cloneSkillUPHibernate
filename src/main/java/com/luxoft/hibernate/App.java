package com.luxoft.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main( String[] args ) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/app-context.xml");
        System.out.println( "Hello World!" );

		Dao dao = (Dao) context.getBean("dao");
		System.out.println(dao.get());
    }
}
