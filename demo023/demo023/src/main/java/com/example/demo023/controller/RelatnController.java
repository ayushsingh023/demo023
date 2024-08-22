package com.example.demo023.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo023.unity.Relatn;


@RestController
@RequestMapping("/api")
public class RelatnController {

//		http:localhost:8080/api/hello
	
	   @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello, World!";
	    }

//		http:localhost:8080/api/relatn
			
		@GetMapping("/relatn")
		public List<Relatn> retrieveAllCourses() {
			return Arrays.asList(
					new Relatn(1, "Demo Spring", "Hello_1"),
					new Relatn(2, "Demo 2 Spring 2", "Hello_2")
					);
		


	}

}
