package com.langmore.model;

public class Security {

	private int securityId;

	private String username;

	private String pass;
	
	public int getSecurityId() {
		return securityId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	private String userId;
}
