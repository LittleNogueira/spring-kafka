package br.com.zup.springkafka.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.zup.springkafka.models.Client;


@Component
public class KafkaConsumer{

    @KafkaListener(topics = "client_topic", groupId = "group_id")
    public void consume(ConsumerRecord<String,Client> consumerRecord){
        System.out.println(consumerRecord.value().getName());
        System.out.println(consumerRecord.value().getEmpresa());
    }
    
}