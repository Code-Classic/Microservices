package com.codeclassic.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    // One-to-Many relationship with employees
    @OneToMany(mappedBy = "role")
    private List<Employee> employees;

    // Constructors, getters, and setters
    // ...

    public Role() {
        // Default constructor
    }

}

