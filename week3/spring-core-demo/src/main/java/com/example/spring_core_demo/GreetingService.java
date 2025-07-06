package com.example.spring_core_demo;

public class GreetingService {
	private final HelloService helloService;

    public GreetingService(HelloService helloService) {
        this.helloService = helloService;
    }

    public void greet() {
        System.out.println("Greeting the user...");
        helloService.sayHello();
    }
}
