package br.com.zup.springkafka.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.springkafka.models.Client;
import br.com.zup.springkafka.services.KafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/client")
public class ClientController{
    
    @Autowired
    private KafkaService<Client> kafkaService;

    @GetMapping
    public String getMethodName() {
        kafkaService.send("client_topic",new Client("Mateus", "Zup"));
        return "Hello WOrld!";
    }

}
