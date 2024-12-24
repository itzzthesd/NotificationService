package com.example.NotificationService.consumers;

import org.springframework.kafka.annotation.KafkaListener;

public class EmailConsumer {

    //@KafkaListener(topics = "topicName", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
