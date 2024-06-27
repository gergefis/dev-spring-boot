package com.springboot.app.demo.myapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
//	Expose "/" that return Hello World!"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
//	Expose "/" that return workout information
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run hard for 5k!";
	}
//	Expose "/" that return fortune information
	@GetMapping("fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}
}
