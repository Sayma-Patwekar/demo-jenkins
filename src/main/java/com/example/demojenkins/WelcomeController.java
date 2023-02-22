package com.example.demojenkins;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/test")
	public String Test() {
		return "Testing Spring boot App";
	}
	
}
