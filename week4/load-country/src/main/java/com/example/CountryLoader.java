package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryLoader {

    public static void main(String[] args) {
        // Load XML from classpath
    	// com.example.CountryLoader.java
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("country.xml");
    	Country country = ctx.getBean("country", Country.class);
    	System.out.println(country);
   // → Country{code='IN', name='India'}
    }
}
