package br.com.msansone.api.portfolioservice.client;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.msansone.api.portfolioservice.model.Stock;
import br.com.msansone.api.portfolioservice.model.Transaction;

@FeignClient("stock-db-service")
public interface StockDbClient {

	@GetMapping("/api/stockdb/transaction")
	public ResponseEntity<List<Transaction>> getAllTransaction();
	
	@GetMapping("/api/stockdb/stock/code/{code}")
	public ResponseEntity<Stock> getStockByCode(@PathVariable String code);
	
	@PostMapping("/api/stockdb/transaction")
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transacation);

	@PutMapping("/api/stockdb/stock/{id}")
	public ResponseEntity<Stock> updateStocke(@PathVariable Long id, @RequestBody Stock stock);

	}
