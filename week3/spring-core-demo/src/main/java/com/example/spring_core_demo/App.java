package com.example.spring_core_demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
    	// Load Spring Context using AppConfig class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        
        GreetingService gs = context.getBean(GreetingService.class);
        gs.greet();

    }
}
