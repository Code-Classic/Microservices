package com.codeclassic.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "department_name")
    private String departmentName;

    // One-to-Many relationship with employees
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    // Constructors, getters, and setters
    // ...

    public Department() {
        // Default constructor
    }

    // Constructors with parameters for creating a Department object

    // Getters and setters for all attributes

    // Other methods (if needed)
}

