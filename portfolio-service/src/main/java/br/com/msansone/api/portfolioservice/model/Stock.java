package br.com.msansone.api.portfolioservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;



public class Stock {

	private Long id;
	private String code;
	private String name;
	private String description;
	private BigDecimal lastValue;
	private LocalDate dateLoastvalue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getLastValue() {
		return lastValue;
	}
	public void setLastValue(BigDecimal lastValue) {
		this.lastValue = lastValue;
	}
	public LocalDate getDateLoastvalue() {
		return dateLoastvalue;
	}
	public void setDateLoastvalue(LocalDate dateLoastvalue) {
		this.dateLoastvalue = dateLoastvalue;
	}
	
	
	
}
