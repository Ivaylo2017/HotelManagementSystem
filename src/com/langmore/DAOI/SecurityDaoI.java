package com.langmore.DAOI;

public interface SecurityDaoI {

	Boolean validateUser(String username, String pass);
	
	void logout();
}
