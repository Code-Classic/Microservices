package com.codeclassic.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.codeclassic.productservice.model.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String>{

}
