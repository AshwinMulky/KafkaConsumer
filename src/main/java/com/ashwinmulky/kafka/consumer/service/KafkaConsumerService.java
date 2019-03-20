package com.ashwinmulky.kafka.consumer.service;

import com.ashwinmulky.kafka.consumer.model.Bill;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "message", groupId = "messageGroup")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "billingTopic", groupId = "billingGroup", containerFactory = "billingKafkaListenerFactory")
    public void readBill(Bill bill) {
        System.out.println("Consumed JSON Message: " + bill);
    }
}
