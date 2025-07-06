package com.example;

public class EmailService implements MessageService {
    @Override
    public String getMessage() {
        return "Email sent successfully!";
    }
}
