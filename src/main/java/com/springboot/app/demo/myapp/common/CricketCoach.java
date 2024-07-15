package com.springboot.app.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component // @Component : Mark the class as a spring bean
//@Lazy
public class CricketCoach implements Coach {

//	Constructor
	public CricketCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());

	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}
}
