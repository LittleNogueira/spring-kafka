package br.com.zup.springkafka.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService<T> {
    private static final String TOPIC = "users";
    
    @Autowired
    private KafkaTemplate<String, T> kafkaTemplate;

    public void send(T  t) {
        this.kafkaTemplate.send(TOPIC, t);
    }
}