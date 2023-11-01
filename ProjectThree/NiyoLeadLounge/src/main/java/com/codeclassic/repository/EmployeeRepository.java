package com.codeclassic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeclassic.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	public Employee findByEmailAddress(String emailAddress);
	
	public Employee findByContactNumber(String contactNumber);
}
