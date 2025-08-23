package com.prince.projects.service;


import com.prince.projects.dto.ProjectRequestDTO;
import com.prince.projects.dto.ProjectResponseDTO;
import com.prince.projects.entity.ProjectEntity;
import com.prince.projects.exception.ProjectNotFoundException;
import com.prince.projects.mapper.ProjectMapper;
import com.prince.projects.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    // ✅ Create Project
    public ProjectResponseDTO createProject(ProjectRequestDTO dto) {
        ProjectEntity entity = ProjectMapper.toEntity(dto);
        ProjectEntity saved = projectRepository.save(entity);
        return ProjectMapper.toDTO(saved);
    }

    // ✅ Get Project by ID
    public ProjectResponseDTO getProjectById(Long id) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found with id: " + id));
        return ProjectMapper.toDTO(entity);
    }

    // ✅ Get All Projects
    public List<ProjectResponseDTO> getAllProjects() {
        return projectRepository.findAll()
                .stream()
                .map(ProjectMapper::toDTO)
                .collect(Collectors.toList());
    }

    // ✅ Update Project
    public ProjectResponseDTO updateProject(Long id, ProjectRequestDTO dto) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found with id: " + id));

        // Update fields
        entity.setName(dto.getName());
        entity.setCode(dto.getCode());
        entity.setDescription(dto.getDescription());
        entity.setStartDate(dto.getStartDate());
        entity.setEndDate(dto.getEndDate());
        entity.setStatus(dto.getStatus());

        ProjectEntity updated = projectRepository.save(entity);
        return ProjectMapper.toDTO(updated);
    }

    // ✅ Delete Project
    public void deleteProject(Long id) {
        if (!projectRepository.existsById(id)) {
            throw new ProjectNotFoundException("Project not found with id: " + id);
        }
        projectRepository.deleteById(id);
    }
}
