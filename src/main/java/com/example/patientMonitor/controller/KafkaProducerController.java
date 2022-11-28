package com.example.patientMonitor.controller;

import com.example.patientMonitor.Kafka.KafkaProducer;
import org.springframework.web.bind.annotation.*;
import utils.AppConstants;

@RestController
@RequestMapping
public class KafkaProducerController {

    private KafkaProducer kafkaProducer;

    public KafkaProducerController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("message")
    public String publish(@RequestBody String message){
        kafkaProducer.sendMessage(AppConstants.TOPIC_NAME,message);
        return "success";

    }

}
