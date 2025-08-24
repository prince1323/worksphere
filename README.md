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
├─ employee-service      # Manage employees (CRUD, validation, exception handling)
├─ department-service    # Manage departments
├─ project-service       # Manage projects
├─ task-service          # Manage tasks assigned to employees/projects
├─ gateway-service       # API Gateway (Spring Cloud Gateway)
├─ service-registry      # Eureka Service Registry
└─ config-server (planned) # Centralized configuration (future)

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
> - REST endpoints: http://localhost:8087/api/employees

> The **Department Service** is fully implemented:
> - DTOs & Mappers
> - Validation (@NotBlank, @Size)
> - Global exception handling
> - Swagger documentation
> - REST endpoints: http://localhost:8084/api/departments

> Project Service (project-service)
> - CRUD operations for projects
> - Validation & exception handling
> - Swagger documentation
> - REST endpoints:http://localhost:8085/api/projects

> Task Service (task-service)
> - CRUD operations for tasks
> - Tasks linked with employees/projects
> - Validation & exception handling
> - Swagger documentation
> - REST endpoints: http://localhost:8086/api/tasks

> Service Registry (service-registry)
> - Eureka server running on http://localhost:8761
> - All microservices successfully registered

> Gateway Service (gateway-service)
> - Routes requests to respective microservices
> - Load-balanced through Eureka

Base URL:

# Employee
http://localhost:8080/api/employees
http://localhost:8080/api/employees/1

# Department
http://localhost:8080/api/departments
http://localhost:8080/api/departments/1

# Project
http://localhost:8080/api/projects

# Task
http://localhost:8080/api/tasks

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

Author: Prince Pandey
