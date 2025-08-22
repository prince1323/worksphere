package com.prince.projects.mapper;

import com.prince.projects.dto.EmployeeDTO;
import com.prince.projects.entity.EmployeeEntity;

public class EmployeeMapper {

	public static EmployeeDTO toDTO(EmployeeEntity employee) {
		return EmployeeDTO.builder()
				.id(employee.getId())
				.name(employee.getName())
				.email(employee.getEmail())
				.salary(employee.getSalary())
				.position(employee.getPosition())
				.departmentId(employee.getDepartmentId()).build();
	}
	
	public static EmployeeEntity toEntity(EmployeeDTO dto) {
        return EmployeeEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .salary(dto.getSalary())
                .position(dto.getPosition())
                .departmentId(dto.getDepartmentId())
                .build();
    }

}
