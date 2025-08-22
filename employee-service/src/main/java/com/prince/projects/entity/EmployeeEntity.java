package com.prince.projects.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees-worksphare")
@Data  
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    @Column(unique = true, nullable = false)
	    private String email;
	    
	    @Column(name = "salary")
	    private Double salary;

	    private String position;

	    @Column(name = "department_id")
	    private Long departmentId;
}
