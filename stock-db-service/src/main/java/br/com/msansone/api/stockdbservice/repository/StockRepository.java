package br.com.msansone.api.stockdbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msansone.api.stockdbservice.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

	List<Stock> findAllByCode(String code);

}
