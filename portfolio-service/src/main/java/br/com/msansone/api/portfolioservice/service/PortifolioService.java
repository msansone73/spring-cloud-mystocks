package br.com.msansone.api.portfolioservice.service;

import java.util.List;

import br.com.msansone.api.portfolioservice.model.Transaction;
import br.com.msansone.api.portfolioservice.model.rest.TransactionAddRequest;

public interface PortifolioService {

	List<Transaction> getAllTransactions();

	Transaction addTransaction(TransactionAddRequest request);

}
