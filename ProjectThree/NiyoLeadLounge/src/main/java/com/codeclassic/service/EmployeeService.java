package com.codeclassic.service;

import java.util.List;

import com.codeclassic.entity.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	
	public void updateEmployee(Long  id);
	
	public void removeEmployee();
	
	public List<Employee> fetchAllEmployees();
	
	public Employee fetchById(Long id);

	void updateEmployee(Employee emp, Long id);

	void removeEmployee(Long id);

	public Employee fetchEmployeeByMobile(String contactNumber);
	
	public Employee fetchEmployeeByEmail(String contactNumber);

}
