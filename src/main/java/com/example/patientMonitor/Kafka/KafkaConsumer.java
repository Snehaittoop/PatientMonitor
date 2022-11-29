package com.example.patientMonitor.Kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import utils.AppConstants;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = AppConstants.TOPIC_NAME1,
            groupId = AppConstants.GROUP_ID)
    public void observationConsume(String message){
        System.out.println(message);

    }

}
