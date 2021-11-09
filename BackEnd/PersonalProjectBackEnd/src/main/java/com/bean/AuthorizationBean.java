package com.bean;

//this is a bean to return success message to client side
public class AuthorizationBean {
	
	private String message;
	
	public AuthorizationBean(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return String.format(message);
	}
	
}
