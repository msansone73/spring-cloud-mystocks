package br.com.msansone.api.portfolioservice.model.rest;

import java.util.List;

import br.com.msansone.api.portfolioservice.model.Transaction;

public class TransactionListResponse extends AbstractResponse {
	
	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
