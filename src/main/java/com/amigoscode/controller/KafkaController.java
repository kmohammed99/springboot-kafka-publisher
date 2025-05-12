package com.amigoscode.controller;

import com.amigoscode.dto.MessageRequest;
import com.amigoscode.service.KafkaPublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaPublisherService kafkaPublisherService;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody MessageRequest request) {
        kafkaPublisherService.sendMessage(request);
        return ResponseEntity.ok("Message sent to topic: " + request.topic());
    }
}
