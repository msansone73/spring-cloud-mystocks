package br.com.msansone.api.stockwebservice.controller;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msansone.api.stockwebservice.model.StockWebResponse;
import br.com.msansone.api.stockwebservice.service.StockWebService;

@RestController
@RequestMapping("/api/stockweb")
public class StockWebController {

	@Autowired
	StockWebService stockWebService;
	
	@GetMapping("/{code}")
	public ResponseEntity<StockWebResponse> getStockWebValue(@PathVariable String code){
		StockWebResponse response = new StockWebResponse();
		
		try {
			response.setCode(code);
			response.setValue(stockWebService.getValue(code));
		} catch (IOException e) {
			response.setError("err - "+ e.getMessage());
		}
		
		return new ResponseEntity<StockWebResponse>(response, HttpStatus.OK);
		
	}
	
	
	
}
