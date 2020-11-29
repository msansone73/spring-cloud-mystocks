package br.com.msansone.api.stockdbservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msansone.api.stockdbservice.model.Stock;
import br.com.msansone.api.stockdbservice.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;
	
	@Override
	public List<Stock> findAll() {
		return stockRepository.findAll();
	}

	@Override
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock findById(Long id) {
		return stockRepository.findById(id).orElse(null);
	}

	@Override
	public Stock getStockByCode(String code) {
		Stock response = null;
		
		List<Stock>  stocks = stockRepository.findAllByCode(code);
		if (stocks.size()>=0) {
			response=stocks.get(0);
		} 
		
		return response;
	}


}
