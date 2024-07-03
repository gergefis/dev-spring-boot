package com.springboot.app.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout(){
		return "Practice your backhand volley";
	}
}
