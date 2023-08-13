package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.Transaction;
import com.app.repository.TransactionRepository;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionrepo;

	@Override
	public List<Transaction> getAllTransactions() {
		
		return transactionrepo.findAll();
	}

	@Override
	public ApiResponse addTransactionDetail(Transaction transientTransaction) {
		String msg="Adding Transaction Failed";
		Transaction transaction=transactionrepo.save(transientTransaction);
		if(transaction != null)
		{
			msg="Transaction added Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateTransaction(Transaction detachedTransaction) {
		
		String msg="Updating Transaction Failed";
		Transaction transaction=transactionrepo.save(detachedTransaction);
		if(transaction != null)
		{
			msg="Transaction details updated Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public Transaction getTransaction(Long id) {
		
			return transactionrepo.findById(id)
					.orElseThrow(null);
		
		
	}

	@Override
	public String removeTransaction(Long id) {
		String mesg="Id invalid cannot delete record";
		if(transactionrepo.existsById(id))
		{
			mesg="Deleted Successfully";
		}
		
		return mesg;
		
	}

}
