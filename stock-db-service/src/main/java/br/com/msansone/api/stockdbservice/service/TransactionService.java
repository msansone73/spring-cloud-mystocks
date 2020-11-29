package br.com.msansone.api.stockdbservice.service;

import java.util.List;

import br.com.msansone.api.stockdbservice.model.Transaction;

public interface TransactionService {

		List<Transaction>getAll();

		Transaction save(Transaction transacation);

}
