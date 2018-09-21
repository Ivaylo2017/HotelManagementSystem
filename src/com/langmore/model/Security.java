package com.langmore.model;

public class Security {

	private int securityId;
	private String username, pass, userType;
	
	public Security() {	}
	
	public Security( String username, String password,String userT) {
		this.username= username;
		pass = password;
		userType = userT;
		
	}
	
	public int getSecurityId() {
		return securityId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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

}
