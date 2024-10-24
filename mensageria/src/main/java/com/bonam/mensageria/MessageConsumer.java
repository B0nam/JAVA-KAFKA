package com.bonam.mensageria;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "topico", groupId = "group-1")
    public void receberMensagem(String message) {
        System.out.println("[CONSUMIDOR]: " + message);
    }
}