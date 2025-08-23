package com.prince.projects.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectRequestDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String code;

    private String description;
    @NotNull
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
}