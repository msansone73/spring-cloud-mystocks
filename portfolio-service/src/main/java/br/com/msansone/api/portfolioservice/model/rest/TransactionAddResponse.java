package br.com.msansone.api.portfolioservice.model.rest;

import br.com.msansone.api.portfolioservice.model.Transaction;

public class TransactionAddResponse extends AbstractResponse {
	
	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	

}
