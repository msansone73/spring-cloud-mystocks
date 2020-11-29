package br.com.msansone.api.stockwebservice.service;

import java.io.IOException;
import java.math.BigDecimal;

public interface StockWebService {

	BigDecimal getValue(String code) throws IOException;

}
