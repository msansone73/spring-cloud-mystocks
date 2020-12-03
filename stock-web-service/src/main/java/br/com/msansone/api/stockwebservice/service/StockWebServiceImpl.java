package br.com.msansone.api.stockwebservice.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.msansone.api.stockwebservice.ado.IWebAccess;
import br.com.msansone.api.stockwebservice.model.StockWebInfoResponse;
import br.com.msansone.api.stockwebservice.model.StockWebValResponse;
import org.springframework.stereotype.Service;

@Service
public class StockWebServiceImpl implements StockWebService {
	
	static String URI="https://www.fundsexplorer.com.br/funds/";

	@Override
	public BigDecimal getValue(String code, IWebAccess webAccess) throws IOException {
		StockWebInfoResponse response = webAccess.getStockInfoData(code);
		//return response.getValue();
		return null;
	}

	@Override
	public StockWebValResponse getStockValues(String code, IWebAccess webAccess) throws IOException {
		return webAccess.getStockValData(code, LocalDate.now());
	}


}
