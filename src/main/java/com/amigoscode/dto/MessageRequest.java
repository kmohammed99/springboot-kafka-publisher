package com.amigoscode.dto;

import com.fasterxml.jackson.databind.JsonNode;

public record MessageRequest(String topic, String key, JsonNode message) {}
