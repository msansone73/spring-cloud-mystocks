package br.com.msansone.api.stockdbservice.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.msansone.api.stockdbservice.model.Stock;
import br.com.msansone.api.stockdbservice.service.StockService;

@RestController
@RequestMapping("/api/stockdb/stock")
public class StockController {
	
	private static Logger LOG = Logger.getLogger("StockController");

	@Autowired
	StockService stockService;
	
	@GetMapping
	public ResponseEntity<List<Stock>> getAllStocks(){
		return new ResponseEntity<>(stockService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Stock> getStockById(@PathVariable Long id){
		return new ResponseEntity<>(
				stockService.findById(id)
				, HttpStatus.OK);
	}
	
	@GetMapping("/code/{code}")
	public ResponseEntity<Stock> getStockByCode(@PathVariable String code){
		return new ResponseEntity<>(
				stockService.getStockByCode(code)
				, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
		Stock newStock = stockService.saveStock(stock);
		return new ResponseEntity<>(newStock, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Stock> updateStocke(@PathVariable Long id, @RequestBody Stock stock){
		try{
			stock=stockService.update(id, stock);
		}catch (Exception e){
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(stock, HttpStatus.OK);
	}
	
	
}

