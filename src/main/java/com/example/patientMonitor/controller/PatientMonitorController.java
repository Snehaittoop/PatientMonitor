package com.example.patientMonitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PatientMonitorController {
    @KafkaListener(topics = "ObservationStart",groupId = "group_id")
    public void ObservationStartconsumer(String message) {

        System.out.println("message = " + message);
    }
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC9 = "telemetrysimulater";
    @GetMapping("/Telemetrysimulator")
    public String TelemtrysimulaterProducer(@RequestBody String message){

        kafkaTemplate.send("BOOK-APPOINTMENT", message);
        return "success";}

}
