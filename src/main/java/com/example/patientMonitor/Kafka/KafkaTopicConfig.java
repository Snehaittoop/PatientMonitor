package com.example.patientMonitor.Kafka;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic patientMonitorTopic(){
        return TopicBuilder.name("Telemetrysimulator")
                .build();
    }
//    @Bean
//    public NewTopic patientTopic(){
//        return TopicBuilder.name("Observationstart")
//                .build();
//    }
}
