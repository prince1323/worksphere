package com.prince.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.projects.entity.TaskEntity;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
