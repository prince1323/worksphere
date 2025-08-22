package com.prince.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prince.projects.entity.DepartmentEntity;


public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> 
{
	
}
