package com.example.NotificationService.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumerService {

    @KafkaListener(topics = "test", groupId = "notification-service-group")
    public void listen(String emailPayload) {
        System.out.println("Received Notification Payload: " + emailPayload);

        // Logic to send email
        sendEmail(emailPayload);
    }

    private void sendEmail(String emailPayload) {
        // Implement email sending logic here (e.g., using JavaMailSender or an external API)
        System.out.println("Email sent to: " + emailPayload);
    }
}
