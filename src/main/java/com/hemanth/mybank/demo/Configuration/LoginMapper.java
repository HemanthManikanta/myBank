package com.hemanth.mybank.demo.Configuration;

import java.util.HashMap;
import java.util.Map;

import com.hemanth.mybank.demo.model.AccountRequest;
import com.hemanth.mybank.demo.model.LoginRequest;

public class LoginMapper {
	
	Map<AccountRequest, LoginRequest> loginCredentials = new HashMap<AccountRequest, LoginRequest>();

	public Map<AccountRequest, LoginRequest> getLoginCredentials() {
		return loginCredentials;
	}

	public void setLoginCredentials(Map<AccountRequest, LoginRequest> loginCredentials) {
		this.loginCredentials = loginCredentials;
	}
	


}
