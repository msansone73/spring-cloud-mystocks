package br.com.msansone.api.portfolioservice.model.rest;

public class Err {
	
	private String Message;
	private Long errorCode;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Long getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Long errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
