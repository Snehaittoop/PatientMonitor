package com.example.patientMonitor.Kafka;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class KafkaTopicConfig {
    /*Topic creation for Patient monitor producer */
    @Bean
    public NewTopic patientMonitorTopic(){
        return TopicBuilder.name("observationTelemetry").build();
    }
    /* topic creation for Patient monitor consumer*/
   @Bean
   public NewTopic patientTopic(){
        return TopicBuilder.name("ObservationStart").build();
    }
}
