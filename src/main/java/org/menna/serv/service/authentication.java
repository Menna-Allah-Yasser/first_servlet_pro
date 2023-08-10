package org.menna.serv.service;

public class authentication {
	
	public boolean auth(String email , String pass) {
		if(email.length()>=3 && pass.length()>=3)
			return true;
		
		return false;
	}

}
