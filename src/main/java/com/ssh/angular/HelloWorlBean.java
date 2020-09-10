package com.ssh.angular;

public class HelloWorlBean {
	
	private String message;

	public HelloWorlBean(String message) {
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
