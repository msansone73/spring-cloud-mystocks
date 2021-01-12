package br.com.msansone.api.stockwebservice.service;

import br.com.msansone.api.stockwebservice.ado.IWebAccess;
import br.com.msansone.api.stockwebservice.model.StockWebValResponse;

import java.io.IOException;
import java.math.BigDecimal;

public interface StockWebService {

	BigDecimal getValue(String code, IWebAccess webAccess) throws IOException;

	StockWebValResponse getStockValues(String code, IWebAccess webAccess) throws IOException;

}
