package com.prince.projects.mapper;

import com.prince.projects.dto.TaskDTO;
import com.prince.projects.entity.TaskEntity;


public class TaskMapper {
    public static TaskDTO mapToTaskDto(TaskEntity task) {
        return TaskDTO.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .status(task.getStatus())
                .priority(task.getPriority())
                .dueDate(task.getDueDate())
                .employeeId(task.getEmployeeId())
                .projectId(task.getProjectId())
                .build();
    }

    public static TaskEntity mapToTask(TaskDTO taskDto) {
        return TaskEntity.builder()
                .id(taskDto.getId())
                .title(taskDto.getTitle())
                .description(taskDto.getDescription())
                .status(taskDto.getStatus())
                .priority(taskDto.getPriority())
                .dueDate(taskDto.getDueDate())
                .employeeId(taskDto.getEmployeeId())
                .projectId(taskDto.getProjectId())
                .build();
    }
}
