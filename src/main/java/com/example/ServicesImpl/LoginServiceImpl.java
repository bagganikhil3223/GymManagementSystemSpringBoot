package com.example.ServicesImpl;

import org.springframework.stereotype.Service;

import com.example.Model.Login;
import com.example.Model.LoginResponse;
import com.example.Services.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public LoginResponse Authenticate(Login login) {
		// TODO Auto-generated method stub
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setUserName(login.getUserName());
		loginResponse.setPassWord(login.getPassWord());
		loginResponse.setToken("is Authenticated");
		return loginResponse;
	}
	
	

}
