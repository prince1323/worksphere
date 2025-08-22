package com.prince.projects.dto;

import lombok.Data;

@Data
public class CreateEmployeeDTO {
    private String name;
    private String email;
    private Long departmentId;
}
