package com.example.Controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Model.Login;
import com.example.Model.LoginResponse;
import com.example.Services.LoginService;
@RestController
@RequestMapping("/app")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
    @PostMapping("/authenticate")
	public ResponseEntity<?> Login(@RequestBody Login login) {
    	LoginResponse loginResponse = null;
    	loginResponse = loginService.Authenticate(login);
    	return new ResponseEntity(loginResponse, HttpStatus.OK);
	}
}
