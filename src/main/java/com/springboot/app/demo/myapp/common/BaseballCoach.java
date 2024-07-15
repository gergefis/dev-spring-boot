package com.springboot.app.demo.myapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component // @Component : Mark the class as a spring bean
//@Lazy
public class BaseballCoach implements Coach{

	public BaseballCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes in batting practice";
	}

}
