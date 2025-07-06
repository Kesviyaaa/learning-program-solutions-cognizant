package com.example.spring_core_demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {
	@Bean
    public HelloService helloService() {
        return new HelloService();
    }
	@Bean
	public GreetingService greetingService() {
	    return new GreetingService(helloService());
	}
}
