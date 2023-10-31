package com.codeclassic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeclassic.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	public Employee findByEmailAddress(String emailAddress);
	
	public Employee findByContactNumber(String contactNumber);
}
