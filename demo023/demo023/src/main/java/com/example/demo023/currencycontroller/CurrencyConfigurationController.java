package com.example.demo023.currencycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo023.serviceconfiguration.CurrencyServiceConfiguration;

@RestController
@RequestMapping("/api")
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retriveAllCourses() {
		return configuration;
	}

}


// http:localhost:8080/api/currency-configuratin