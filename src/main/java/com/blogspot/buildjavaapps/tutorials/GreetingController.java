package com.blogspot.buildjavaapps.tutorials;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello, World") String name){
		Greeting greeting = new Greeting(1000L, name);
		return greeting;
	}

}
