package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService() {
        return new EmailService();  // Make sure EmailService implements MessageService
    }

    @Bean
    public NotificationManager notificationManager() {
        return new NotificationManager(messageService()); // Bean wiring
    }
}
