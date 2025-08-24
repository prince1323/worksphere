package com.prince.projects.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.prince.projects.dto.TaskDTO;
import com.prince.projects.entity.TaskEntity;
import com.prince.projects.exception.TaskNotFoundException;
import com.prince.projects.mapper.TaskMapper;
import com.prince.projects.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
	
    private final TaskRepository taskRepository;
    
    
    public TaskDTO createTask(TaskDTO taskDto) {
        TaskEntity task = TaskMapper.mapToTask(taskDto);
        TaskEntity saved = taskRepository.save(task);
        return TaskMapper.mapToTaskDto(saved);
    }

    public TaskDTO getTaskById(Long id) {
        return taskRepository.findById(id)
                .map(TaskMapper::mapToTaskDto)
                .orElseThrow(() -> new TaskNotFoundException("Task not found with id: " + id));
    }

    public List<TaskDTO> getAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(TaskMapper::mapToTaskDto)
                .collect(Collectors.toList());
    }

    public TaskDTO updateTask(Long id, TaskDTO taskDto) {
        TaskEntity task = taskRepository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException("Task not found with id: " + id));

        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setStatus(taskDto.getStatus());
        task.setPriority(taskDto.getPriority());
        task.setDueDate(taskDto.getDueDate());
        task.setEmployeeId(taskDto.getEmployeeId());
        task.setProjectId(taskDto.getProjectId());

        TaskEntity updated = taskRepository.save(task);
        return TaskMapper.mapToTaskDto(updated);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


}
