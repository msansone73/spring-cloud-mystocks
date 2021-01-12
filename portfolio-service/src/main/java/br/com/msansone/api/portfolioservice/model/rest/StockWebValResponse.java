package br.com.msansone.api.portfolioservice.model.rest;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StockWebValResponse {

	private String code;
	private BigDecimal valOpen;
	private BigDecimal valClose;
	private BigDecimal valHigh;
	private BigDecimal valLow;
	private LocalDate date;
	private JEError error;

	public JEError getError() {
		return error;
	}

	public void setError(JEError error) {
		this.error = error;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getValOpen() {
		return valOpen;
	}

	public void setValOpen(BigDecimal valOpen) {
		this.valOpen = valOpen;
	}

	public BigDecimal getValClose() {
		return valClose;
	}

	public void setValClose(BigDecimal valClose) {
		this.valClose = valClose;
	}

	public BigDecimal getValHigh() {
		return valHigh;
	}

	public void setValHigh(BigDecimal valHigh) {
		this.valHigh = valHigh;
	}

	public BigDecimal getValLow() {
		return valLow;
	}

	public void setValLow(BigDecimal valLow) {
		this.valLow = valLow;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "StockWebValResponse{" +
				"code='" + code + '\'' +
				", valOpen=" + valOpen +
				", valClose=" + valClose +
				", valHigh=" + valHigh +
				", valLow=" + valLow +
				", date=" + date +
				", error=" + error +
				'}';
	}
}

