package com.prince.projects.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.prince.projects.entity.ProjectEntity;


public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> 
{
	Optional<ProjectEntity> findByCode(String code);
}
