package com.springboot.app.demo.myapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout(){
		return "Spend0 minutes in batting practice";
	}

}
