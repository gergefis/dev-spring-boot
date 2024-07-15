package com.springboot.app.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component // @Component : Mark the class as a spring bean
//@Primary
public class TennisCoach implements Coach {

//	Constructor - Diagnostics :
	public TennisCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout(){
		return "Practice your backhand volley";
	}

}
