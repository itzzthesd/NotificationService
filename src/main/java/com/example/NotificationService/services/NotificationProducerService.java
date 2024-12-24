package com.example.NotificationService.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    
    private String notificationTopic = "test";

    public NotificationProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendNotification(String emailPayload) {
        kafkaTemplate.send(notificationTopic, emailPayload);
    }
}

