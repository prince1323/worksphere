package com.prince.projects.mapper;

import com.prince.projects.dto.ProjectRequestDTO;
import com.prince.projects.dto.ProjectResponseDTO;
import com.prince.projects.entity.ProjectEntity;

public class ProjectMapper {
    public static ProjectEntity toEntity(ProjectRequestDTO dto) {
        return ProjectEntity.builder()
                .name(dto.getName())
                .code(dto.getCode())
                .description(dto.getDescription())
                .startDate(dto.getStartDate())
                .endDate(dto.getEndDate())
                .status(dto.getStatus())
                .build();
    }

    public static ProjectResponseDTO toDTO(ProjectEntity project) {
        return ProjectResponseDTO.builder()
                .id(project.getId())
                .name(project.getName())
                .code(project.getCode())
                .description(project.getDescription())
                .startDate(project.getStartDate())
                .endDate(project.getEndDate())
                .status(project.getStatus())
                .build();
    }
}
