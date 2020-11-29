package br.com.msansone.api.stockwebservice.model;

import java.math.BigDecimal;

public class StockWebResponse {
	
	private String code;
	private BigDecimal value;
	private String error;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	

}
