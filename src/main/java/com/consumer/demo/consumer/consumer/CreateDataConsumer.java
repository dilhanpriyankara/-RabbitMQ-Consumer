package com.consumer.demo.consumer.consumer;

import org.springframework.stereotype.Service;

@Service
public class CreateDataConsumer {
    /*
     * @RabbitListener(queues = { "${createData.queue.name}" }) public void consume(String message) {
     * 
     * System.out.println("Message arrived! Message: " + message); }
     */
}
