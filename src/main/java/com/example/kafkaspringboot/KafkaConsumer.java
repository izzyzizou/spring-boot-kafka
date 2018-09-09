package com.example.kafkaspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "${spring.kafka.consumer.group-id}", topicPartitions = {@TopicPartition(topic =
            "kafka" +
            "-example", partitionOffsets = @PartitionOffset(partition = "0", initialOffset = "0"))})
    public void listen(@Payload String message){
        LOG.info("Received messages= '{}' ", message);
    }
}
