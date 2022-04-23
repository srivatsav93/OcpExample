package com.example.OcpTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contr {
	
	
	@GetMapping("/getString")
	public String getString() {
		return "Hello World !!";
	}
	
	@GetMapping("/getInt")
	public int getInt() {
		return 10;
	}

}
