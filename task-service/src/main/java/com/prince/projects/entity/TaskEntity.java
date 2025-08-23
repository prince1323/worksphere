package com.prince.projects.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private String status; // TODO: Can be changed to ENUM (PENDING, IN_PROGRESS, COMPLETED)

    private String priority; // e.g., HIGH, MEDIUM, LOW

    private LocalDate dueDate;

    private Long employeeId; // FK reference to Employee

    private Long projectId;  // FK reference to Project
}
