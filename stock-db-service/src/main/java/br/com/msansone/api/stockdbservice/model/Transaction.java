package br.com.msansone.api.stockdbservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.NotNull;


@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	private Stock stock;
	@NotNull
	private LocalDate date;
	@NotNull
	private Long stockQuantity;
	@NotNull
	private BigDecimal stockUnitValue;
	@NotNull
	private BigDecimal transactionValue;
	@NotNull
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
