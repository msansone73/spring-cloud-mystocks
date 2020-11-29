package br.com.msansone.api.portfolioservice.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.msansone.api.portfolioservice.client.StockDbClient;
import br.com.msansone.api.portfolioservice.client.StockWebClient;
import br.com.msansone.api.portfolioservice.model.Stock;
import br.com.msansone.api.portfolioservice.model.Transaction;
import br.com.msansone.api.portfolioservice.model.rest.StockWebResponse;
import br.com.msansone.api.portfolioservice.model.rest.TransactionAddRequest;

@Service
public class PortifolioServiceImpl implements PortifolioService{

	@Autowired
	StockDbClient stockDbClient;
	
	
	@Autowired
	StockWebClient stockWebClient;
	
	@Override
	public List<Transaction> getAllTransactions() {
		ResponseEntity<List<Transaction>> ret = stockDbClient.getAllTransaction();
		
		return ret.getBody();
	}

	@Override
	public Transaction addTransaction(TransactionAddRequest request) {

		Transaction transaction = new Transaction();
		
		String stockCode = request.getCode();
		Long stockQtd = request.getQuantity();
		
		// get stockUnitaryValue
		ResponseEntity<StockWebResponse> response = stockWebClient.getStockWebValue(stockCode);
		BigDecimal stockUnitaryValue = response.getBody().getValue(); 
		
		// get Stock with code
		ResponseEntity<Stock> responseCode = stockDbClient.getStockByCode(stockCode);
		Stock stock = responseCode.getBody();
		
		// set transaction
		transaction.setStock(stock);
		transaction.setDate(LocalDate.now());
		transaction.setStockQuantity(stockQtd);
		transaction.setStockUnitValue(stockUnitaryValue);
		transaction.setTransactionType("C");
		transaction.setTransactionValue(stockUnitaryValue.multiply(new BigDecimal(stockQtd)));
		
		// add transaction
		ResponseEntity<Transaction> responseTran = stockDbClient.addTransaction(transaction);
		transaction=responseTran.getBody();
		
		return transaction;
	}

}
