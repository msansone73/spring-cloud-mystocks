package br.com.msansone.api.stockwebservice.controller;

import java.io.IOException;

import br.com.msansone.api.stockwebservice.ado.MarketStackWebAccess;
import br.com.msansone.api.stockwebservice.model.StockWebValResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.api.stockwebservice.model.StockWebInfoResponse;
import br.com.msansone.api.stockwebservice.service.StockWebService;

@RestController
@RequestMapping("/api/stockweb")
public class StockWebController {

	@Autowired
	StockWebService stockWebService;
	
	@GetMapping("/{code}")
	public ResponseEntity<StockWebValResponse> getStockWebValue(@PathVariable String code){
		StockWebValResponse response = new StockWebValResponse();
		
		try {
			response.setCode(code);
			//response.setValue(stockWebService.getValue(code, new FundsExplorerWebAccess()));
			response = stockWebService.getStockValues(code, new MarketStackWebAccess());
		} catch (IOException e) {
			response=null;
		}
		
		return new ResponseEntity<StockWebValResponse>(response, HttpStatus.OK);
		
	}
	
	
	
}
