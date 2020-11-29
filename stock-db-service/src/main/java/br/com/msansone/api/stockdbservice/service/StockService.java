package br.com.msansone.api.stockdbservice.service;

import java.util.List;

import br.com.msansone.api.stockdbservice.model.Stock;

public interface StockService {

	List<Stock> findAll();

	Stock saveStock(Stock stock);

	Stock findById(Long id);

	Stock getStockByCode(String code);

}
