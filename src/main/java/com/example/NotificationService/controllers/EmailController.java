package com.example.NotificationService.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.NotificationService.services.NotificationProducerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/notify")
public class EmailController {

    private NotificationProducerService notificationProducerService;

    public EmailController(NotificationProducerService notificationProducerService){
        this.notificationProducerService = notificationProducerService;
    }

    @PostMapping("/email")
    public void postMethodName(@RequestBody String msg) {
        notificationProducerService.sendNotification(msg);
    }  

}
