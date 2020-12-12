package com.example.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	
	@RequestMapping("/")
    public String noPageFound() {
    	return "No page found";
    }

}
