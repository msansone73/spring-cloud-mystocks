package br.com.msansone.api.stockdbservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String code;
	@NotNull
	private String name;
	private String description;
	private BigDecimal lastValue;
	private LocalDateTime dateLastvalue;
	
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
	public LocalDateTime getDateLoastvalue() {
		return dateLastvalue;
	}
	public void setDateLoastvalue(LocalDateTime dateLoastvalue) {
		this.dateLastvalue = dateLoastvalue;
	}
	
	
	
}
