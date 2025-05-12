package com.amigoscode.service;

import com.amigoscode.dto.MessageRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaPublisherService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public void sendMessage(MessageRequest request) {
        try {
            String jsonPayload = objectMapper.writeValueAsString(request.message());
            kafkaTemplate.send(request.topic(), request.key(), jsonPayload);
            log.info("✅ Sent message to topic [{}]: {}", request.topic(), jsonPayload);
        } catch (Exception e) {
            log.error("❌ Failed to send Kafka message", e);
            throw new RuntimeException("Kafka send error", e);
        }
    }
}
