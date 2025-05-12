# 📦 Spring Boot Kafka Publisher

This project is a minimal Spring Boot Kafka Producer application that publishes 100 messages to a Kafka topic on application startup. It serves as a simple and practical example of integrating Apache Kafka with Spring Boot using `KafkaTemplate`.

---

## 🚀 Features

- ✔️ Kafka Producer using Spring Boot
- ✔️ Sends 100 sample messages to a topic named `deepDev`
- ✔️ Configurable Kafka topic and server properties
- ✔️ Includes Docker Compose for local Kafka setup

---

## 📂 Project Structure
src/main/java/com/amigoscode/
├── controller/ # REST endpoints (if extended)
├── dto/ # Data Transfer Objects
├── listener/ # Kafka listeners (for future use)
├── service/ # Business logic
├── config/ # Kafka configuration
└── KafkaApplication.java # Main Spring Boot class

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot 3.x
- Apache Kafka
- Maven
- Docker (for Kafka runtime)

---

## 🐳 Running Kafka Locally (Docker)

To run Kafka and Zookeeper locally, use the provided Docker Compose file:

1. Create a file named `kafka-docker-compose.yml` in your project root.


