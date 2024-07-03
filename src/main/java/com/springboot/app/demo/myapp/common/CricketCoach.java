package com.springboot.app.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component // @Component : Mark the class as a spring bean
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practe fast bowling for 15 minutes";
	}
}
