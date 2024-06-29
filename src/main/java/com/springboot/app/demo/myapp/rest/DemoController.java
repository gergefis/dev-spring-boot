package com.springboot.app.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
	private Coach myCoach;

	@Autowired // Tells Spring to inject a dependency,
				// if we have only 1 Constructor, then, this annotation on constructor is optional
	public DemoController(Coach theCoach){ // Constructor
		myCoach = theCoach;
	}
	@GetMapping("/dailyworkout")
	public String getDailyWorkout(){
		return myCoach.getDailyWorkout();
	}

}
