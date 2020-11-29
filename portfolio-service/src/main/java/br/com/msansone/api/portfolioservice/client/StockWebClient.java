package br.com.msansone.api.portfolioservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.msansone.api.portfolioservice.model.rest.StockWebResponse;


@FeignClient("stock-web-service")
public interface StockWebClient {

	@GetMapping("/api/stockweb/{code}")
	public ResponseEntity<StockWebResponse> getStockWebValue(@PathVariable String code);
	
}
