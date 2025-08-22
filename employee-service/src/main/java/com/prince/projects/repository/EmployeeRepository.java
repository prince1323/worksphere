package com.prince.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prince.projects.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> 
{
	
}
