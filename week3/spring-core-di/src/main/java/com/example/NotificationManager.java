package com.example;

public class NotificationManager {
    private final MessageService messageService;

    public NotificationManager(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser() {
        System.out.println("Notification: " + messageService.getMessage());
    }
}
