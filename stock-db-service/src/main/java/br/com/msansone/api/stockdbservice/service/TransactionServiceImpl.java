package br.com.msansone.api.stockdbservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.api.stockdbservice.model.Transaction;
import br.com.msansone.api.stockdbservice.repository.TransactionRepository;


@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository transactionRepository;
	
	@Override
	public List<Transaction> getAll() {
		return transactionRepository.findAll();
	}

	@Override
	public Transaction save(Transaction transacation) {
		return transactionRepository.save(transacation);
	}

}
