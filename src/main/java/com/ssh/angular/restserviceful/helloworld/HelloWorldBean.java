package com.ssh.angular.restserviceful.helloworld;

public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean(String message) {
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
		//return "HelloWorlBean [message=" + message + "]";
		return String.format("HelloWorldBean [message=%s]",message);
	}

	
	
	

}
