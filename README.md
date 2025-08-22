# WorkSphare - Employee Management System

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-brightgreen)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-4.0.0-orange)](https://maven.apache.org/)
[![Build](https://img.shields.io/badge/Build-Passing-brightgreen)](#)
[![Swagger](https://img.shields.io/badge/Swagger-Enabled-green)](#)
[![MySQL](https://img.shields.io/badge/MySQL-Connected-blue)](#)
[![API](https://img.shields.io/badge/API-Available-brightgreen)](#)

WorkSphare is a **microservices-based Employee Management System (EMS)** built with **Spring Boot, Spring Cloud, and MySQL**, designed for scalability and production readiness. This project is under active development.

---

## Overview

WorkSphare manages **employees, departments, and projects** in a modular microservices architecture. Key features:

- Employee CRUD operations
- Department management
- Project assignments
- JWT-based authentication (planned)
- Centralized API gateway and service discovery (Eureka)
- Validation, exception handling, and Swagger/OpenAPI documentation

---

## Microservices Structure
WorkSphare (parent project)
├─ employee-service # CRUD for employees
├─ department-service # CRUD for departments
├─ project-service # Employee-project assignments
├─ auth-service # Authentication & JWT
├─ gateway-service # Spring Cloud Gateway
├─ discovery-service # Eureka service registry
└─ config-server (optional) # Centralized configuration

---

## Technology Stack

- **Backend:** Java, Spring Boot, Spring Data JPA, Spring Cloud  
- **Database:** MySQL  
- **Validation & DTOs:** Hibernate Validator, Lombok, ModelMapper  
- **Documentation:** Swagger / OpenAPI  
- **Build Tool:** Maven  

---

## Current Status

> ⚠️ Work in Progress  
> The **Employee Service** is fully implemented:
> - DTOs & Mappers  
> - Validation (`@NotBlank`, `@Email`)  
> - Global exception handling  
> - Swagger documentation  
> - REST endpoints: `http://localhost:8081/api/employees`  

Other microservices are scaffolds and will be developed next.

---

## Running Employee Service

1. Create MySQL database:

```sql

CREATE DATABASE ems_microservice;

Update application.properties with your DB credentials.

Build and repackage:
mvn clean package spring-boot:repackage

Run the service:
java -jar target/employee-service-0.0.1-SNAPSHOT.jar

Access Swagger UI:
http://localhost:8081/swagger-ui.html

Next Steps:
Complete Department & Project Services
Implement Auth Service with JWT
Setup Gateway & Eureka Discovery
Add Inter-service communication (Feign/RestTemplate)
Optional Notification/Email Service

---

## License
Currently unlicensed; license will be added upon stable release.

---

This project is under active development. Stay tuned for updates on additional microservices and features.
