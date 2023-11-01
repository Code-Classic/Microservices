package com.codeclassic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeclassic.entity.Employee;
import com.codeclassic.service.EmployeeService;

@CrossOrigin(originPatterns = "http://localhost:3000")
@RestController
public class MyAppController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public ResponseEntity<?> allEmployees(){
		return new ResponseEntity<>(employeeService.fetchAllEmployees(),HttpStatus.OK);
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp){
		return new ResponseEntity<>(employeeService.addEmployee(emp),HttpStatus.CREATED);
	}
	
	@PostMapping("/updateEmployee")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee emp){
		return new ResponseEntity<>(employeeService.addEmployee(emp),HttpStatus.CREATED);
	}
	
}
