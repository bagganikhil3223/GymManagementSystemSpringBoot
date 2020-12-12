package com.example.Controllers;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/app")
public class LoginController {
    @RequestMapping("/hi")
	public String Login() {
		return "HI";
	}
}
