package com.codeclassic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeclassic.entity.Employee;

@Service
public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	
	public void removeEmployee();
	
	public List<Employee> fetchAllEmployees();
	
	public Employee fetchById(Long id);

	void updateEmployee(Employee emp, Long id);

	void removeEmployee(Long id);

	public Employee fetchEmployeeByMobile(String contactNumber);
	
	public Employee fetchEmployeeByEmail(String contactNumber);

}
