package br.com.msansone.api.portfolioservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.api.portfolioservice.model.Transaction;
import br.com.msansone.api.portfolioservice.model.rest.TransactionAddRequest;
import br.com.msansone.api.portfolioservice.model.rest.TransactionAddResponse;
import br.com.msansone.api.portfolioservice.model.rest.TransactionListResponse;
import br.com.msansone.api.portfolioservice.service.PortifolioService;

@RestController
@RequestMapping("/api/portifolio")
public class PortifolioController {
	
	@Autowired
	PortifolioService portifolioService;
	
	@GetMapping("/transaction")
	public ResponseEntity<TransactionListResponse> getAllTransactions(){
		TransactionListResponse response = new TransactionListResponse();
		
		List<Transaction>  lista= new ArrayList<Transaction>();
		lista = portifolioService.getAllTransactions();
		response.setTransactions(lista);
		
		return new ResponseEntity<TransactionListResponse>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/transaction")
	public ResponseEntity<TransactionAddResponse> addTransaction(
			@RequestBody TransactionAddRequest request){

		TransactionAddResponse response = new TransactionAddResponse();
		Transaction transaction = portifolioService.addTransaction(request);
		response.setTransaction(transaction);
		
		return new ResponseEntity<TransactionAddResponse>(response, HttpStatus.OK);
		
		
	}

}
