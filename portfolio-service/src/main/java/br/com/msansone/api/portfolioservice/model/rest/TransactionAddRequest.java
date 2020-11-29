package br.com.msansone.api.portfolioservice.model.rest;

public class TransactionAddRequest {
	
	private String code;
	private Long quantity;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	
	

}
