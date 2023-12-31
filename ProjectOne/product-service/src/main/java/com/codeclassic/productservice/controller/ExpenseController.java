package com.codeclassic.productservice.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeclassic.productservice.model.Expense;
import com.codeclassic.productservice.service.ExpenseService;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
	
	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}
	
	@PostMapping
	public ResponseEntity addExpense(@RequestBody Expense expense) {
		expenseService.addExpense(expense);
		return ResponseEntity.status(HttpStatus.CREATED).build();			
	}
	
	public void updateExpense() {
		
	}
	
	public void getAllExpense() {
		expenseService.getAllExpense();
		return 
	}
	
	public void getExpenseByName() {
		
	}
	
	public void deleteExpense() {
		
	}
}
