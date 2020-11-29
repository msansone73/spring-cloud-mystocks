package br.com.msansone.api.portfolioservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Transaction {

	private Long id;
	private Stock stock;
	private LocalDate date;
	private Long stockQuantity;
	private BigDecimal stockUnitValue;
	private BigDecimal transactionValue;
	private String transactionType;

	
	
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Long getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(Long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public BigDecimal getStockUnitValue() {
		return stockUnitValue;
	}
	public void setStockUnitValue(BigDecimal stockUnitValue) {
		this.stockUnitValue = stockUnitValue;
	}
	public BigDecimal getTransactionValue() {
		return transactionValue;
	}
	public void setTransactionValue(BigDecimal transactionValue) {
		this.transactionValue = transactionValue;
	}
	
	
	
}
