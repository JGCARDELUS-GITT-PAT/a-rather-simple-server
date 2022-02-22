package com.jgcardelus.simpleServer;

public class HelloWorld {
	private final String status;
	private final String message;

	public HelloWorld(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public String getStatus() {
		return this.status;
	}
}
