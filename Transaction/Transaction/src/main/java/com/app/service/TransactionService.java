package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.entities.Transaction;

public interface TransactionService {
	
	//get
	List<Transaction> getAllTransactions();

	//add
	ApiResponse addTransactionDetail(Transaction transientTransaction);

	//update
	ApiResponse updateTransaction(Transaction detachedTransaction);

	//find by  id
	Transaction getTransaction(Long id);
	
	//delete by id
	String removeTransaction(Long id);
	
	

}
