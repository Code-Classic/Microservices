package com.codeclassic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeclassic.entity.Employee;
import com.codeclassic.repository.EmployeeRepository;
import com.codeclassic.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	@Override
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public void updateEmployee(Employee emp,Long id) {
		Employee emp2 = fetchById(id);
		emp2.setFirstName(emp.getFirstName());
		emp2.setLastName(emp.getLastName());
		emp2.setRole(emp.getRole());
		emp2.setDepartment(emp.getDepartment());
		emp2.setManager(emp.getManager());
		emp2.setEmailAddress(emp.getEmailAddress());
		emp2.setContactNumber(emp.getContactNumber());
	}

	@Override
	public void removeEmployee(Long id) {
		Employee emp = fetchById(id);
		employeeRepository.delete(emp);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeByMobile(String contactNumber) {
		Employee emp = employeeRepository.findByContactNumber(contactNumber);
		return emp;
	}
	
	@Override
	public Employee fetchEmployeeByEmail(String emailAddress) {
		Employee emp = employeeRepository.findByContactNumber(emailAddress);
		return emp;
	}

	@Override
	public Employee fetchById(Long id) {
		Employee emp = employeeRepository.findById(id).get();
		return emp;
	}

	@Override
	public void updateEmployee(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee() {
		// TODO Auto-generated method stub
		
	}
	
}
