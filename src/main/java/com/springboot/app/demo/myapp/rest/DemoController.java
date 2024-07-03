package com.springboot.app.demo.myapp.rest;

import com.springboot.app.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
	private Coach myCoach;

	// setter method
	@Autowired // Tells Spring to inject a dependency,
	// if we have only 1 Constructor, then, this annotation is optional
	public void setCoach(@Qualifier("tennisCoach") Coach theCoach){
		myCoach = theCoach;
	}
	@GetMapping("/dailywkout")
	public String getDailyWorkout(){
		return myCoach.getDailyWorkout();
	}
}
