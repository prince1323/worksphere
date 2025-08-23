package com.prince.projects.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Project name is required")
    private String name;

    @NotBlank(message = "Project code is required")
    @Column(unique = true, nullable = false)
    private String code;

    private String description;

	@jakarta.validation.constraints.NotNull(message = "Start date is required")
    private LocalDate startDate;

    private LocalDate endDate;

    private String status; // e.g., "IN_PROGRESS", "COMPLETED"
}
