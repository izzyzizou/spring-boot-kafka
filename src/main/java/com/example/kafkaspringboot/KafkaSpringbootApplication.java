package com.example.kafkaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaSpringbootApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringbootApplication.class, args);
    }
    @Autowired
    private KafkaProducer kafkaProducer;

    @Override
    public void run(String... args) throws Exception{
        kafkaProducer.send("Producing messages part IV with Consumer");
    }
}
