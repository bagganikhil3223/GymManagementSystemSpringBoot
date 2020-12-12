package com.example.Model;

public class LoginResponse {

	private String userName;
	private String passWord;
	private String token;
	public LoginResponse () {
		
	}
	
	public LoginResponse(String userName, String passWord,String token) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.token= token;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
