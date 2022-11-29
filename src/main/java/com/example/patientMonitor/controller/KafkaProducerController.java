package com.example.patientMonitor.controller;

import com.example.patientMonitor.Kafka.KafkaProducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.AppConstants;

@RestController
@RequestMapping
public class KafkaProducerController {
/* patientMonitor Producer */
    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }
    /* create API for patient monitor */
    @GetMapping("message")
    public String patientMonitor(@RequestBody String message){
        kafkaProducer.sendMessage(AppConstants.TOPIC_NAME,message);
        return "success";

    }

}
