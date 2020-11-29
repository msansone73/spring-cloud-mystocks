package br.com.msansone.api.stockdbservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.api.stockdbservice.model.Transaction;
import br.com.msansone.api.stockdbservice.service.TransactionService;

@RestController
@RequestMapping("/api/stockdb/transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;
	
	@GetMapping
	public ResponseEntity<List<Transaction>> getAllTransaction(){
		return new ResponseEntity<>( transactionService.getAll() , HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transacation){
		return new ResponseEntity<Transaction>(transactionService.save(transacation), HttpStatus.OK);		
	}
	
}
