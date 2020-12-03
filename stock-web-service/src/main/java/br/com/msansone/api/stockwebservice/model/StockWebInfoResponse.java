package br.com.msansone.api.stockwebservice.model;

import java.math.BigDecimal;

public class StockWebInfoResponse {
	
	private String code;
	private String name;
	private String stockExchangeName;
	private String stockExchangeAcronym;
	private String stockExchangeMic;
	private String stockExchangeContry;
	private String stockExchangeContryCode;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStockExchangeName() {
		return stockExchangeName;
	}

	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}

	public String getStockExchangeAcronym() {
		return stockExchangeAcronym;
	}

	public void setStockExchangeAcronym(String stockExchangeAcronym) {
		this.stockExchangeAcronym = stockExchangeAcronym;
	}

	public String getStockExchangeMic() {
		return stockExchangeMic;
	}

	public void setStockExchangeMic(String stockExchangeMic) {
		this.stockExchangeMic = stockExchangeMic;
	}

	public String getStockExchangeContry() {
		return stockExchangeContry;
	}

	public void setStockExchangeContry(String stockExchangeContry) {
		this.stockExchangeContry = stockExchangeContry;
	}

	public String getStockExchangeContryCode() {
		return stockExchangeContryCode;
	}

	public void setStockExchangeContryCode(String stockExchangeContryCode) {
		this.stockExchangeContryCode = stockExchangeContryCode;
	}
}
