package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Transaction;
import com.app.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	public TransactionController() {
		System.out.println("in ctor of "+getClass());
	}
	
	@GetMapping
	public List<Transaction> showAllTransaction()
	{
		return transactionService.getAllTransactions();
	}
	
	@PostMapping
	public ResponseEntity<?> addTransaction(@RequestBody Transaction transientTransaction)
	{
		return new ResponseEntity<>(transactionService.addTransactionDetail(transientTransaction),HttpStatus.CREATED);
	}
	
	

	@PutMapping()
	public ResponseEntity<?> updateTransaction(@RequestBody Transaction detachedTransaction)
	{
		return new ResponseEntity<>(transactionService.updateTransaction(detachedTransaction),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public Transaction getById(@PathVariable Long id)
	{
		return transactionService.getTransaction(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTransaction(@PathVariable Long id)
	{
		return transactionService.removeTransaction(id);
	}
	

}
