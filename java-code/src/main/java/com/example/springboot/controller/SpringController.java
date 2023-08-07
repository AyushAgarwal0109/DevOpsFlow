package com.example.springboot.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	private transient Integer val = 0;
	
	@GetMapping(value = "/")
	public String getValue() {
		val++;
		String result = "Thapar University welcomes you in " + val + " seconds!!!!!!!!!!!";
		return result;
	}
}
