package com.prince.projects.mapper;

import com.prince.projects.dto.DepartmentDTO;
import com.prince.projects.entity.DepartmentEntity;

public class DepartmentMapper {

    public static DepartmentDTO toDTO(DepartmentEntity entity) {
        return DepartmentDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .code(entity.getCode())
                .build();
    }

    public static DepartmentEntity toEntity(DepartmentDTO dto) {
        return DepartmentEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .code(dto.getCode())
                .build();
    }
}