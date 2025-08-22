package com.prince.projects.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.prince.projects.dto.DepartmentDTO;
import com.prince.projects.entity.DepartmentEntity;
import com.prince.projects.exception.DepartmentNotFoundException;
import com.prince.projects.mapper.DepartmentMapper;
import com.prince.projects.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public List<DepartmentDTO> getAllDepartments() {
        return repository.findAll().stream()
                .map(DepartmentMapper::toDTO)
                .collect(Collectors.toList());
    }

    public DepartmentDTO getDepartmentById(Long id) {
        DepartmentEntity entity = repository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException("Department not found with id: " + id));
        return DepartmentMapper.toDTO(entity);
    }

    public DepartmentDTO createDepartment(DepartmentDTO dto) {
        DepartmentEntity entity = DepartmentMapper.toEntity(dto);
        return DepartmentMapper.toDTO(repository.save(entity));
    }

    public DepartmentDTO updateDepartment(Long id, DepartmentDTO dto) {
        DepartmentEntity entity = repository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException("Department not found with id: " + id));
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        return DepartmentMapper.toDTO(repository.save(entity));
    }

    public void deleteDepartment(Long id) {
        DepartmentEntity entity = repository.findById(id)
                .orElseThrow(() -> new DepartmentNotFoundException("Department not found with id: " + id));
        repository.delete(entity);
    }
}
