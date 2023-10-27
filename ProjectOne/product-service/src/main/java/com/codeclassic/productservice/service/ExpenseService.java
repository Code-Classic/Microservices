package com.codeclassic.productservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codeclassic.productservice.model.Expense;
import com.codeclassic.productservice.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public void addExpense(Expense expense) {
		expenseRepository.insert(expense);
	}
	
	public void updateExpense() {
		
	}
	
	public List<Expense> getAllExpense() {
		return expenseRepository.findAll();
	}
	
	public void getExpenseByName() {
		
	}
	
	public void deleteExpense() {
		
	}
}
