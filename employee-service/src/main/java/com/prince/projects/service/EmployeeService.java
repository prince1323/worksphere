package com.prince.projects.service;


import com.prince.projects.dto.EmployeeDTO;
import com.prince.projects.entity.EmployeeEntity;
import com.prince.projects.exception.EmployeeNotFoundException;
import com.prince.projects.mapper.EmployeeMapper;
import com.prince.projects.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // ✅ Get all employees
    public List<EmployeeDTO> getAllEmployees() {
        return repository.findAll()
                .stream()
                .map(EmployeeMapper::toDTO)
                .collect(Collectors.toList());
    }

    // ✅ Get employee by ID
    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employee = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
        return EmployeeMapper.toDTO(employee);
    }

    // ✅ Create new employee
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        EmployeeEntity entity = EmployeeMapper.toEntity(dto);
        EmployeeEntity saved = repository.save(entity);
        return EmployeeMapper.toDTO(saved);
    }

    // ✅ Update employee
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO dto) {
        EmployeeEntity existing = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));

        existing.setName(dto.getName());
        existing.setEmail(dto.getEmail());
        existing.setPosition(dto.getPosition());
        existing.setDepartmentId(dto.getDepartmentId());

        EmployeeEntity updated = repository.save(existing);
        return EmployeeMapper.toDTO(updated);
    }

    // ✅ Delete employee
    public void deleteEmployee(Long id) {
        EmployeeEntity existing = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
        repository.delete(existing);
    }
}
