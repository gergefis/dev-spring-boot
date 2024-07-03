package com.springboot.app.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

	@Override
	public String getDailyWorkout(){
		return "Run a rd 5k!";
	}
}
