package com.example.Services;

import com.example.Model.Login;
import com.example.Model.LoginResponse;

public interface LoginService {

	public LoginResponse Authenticate(Login login);
}
