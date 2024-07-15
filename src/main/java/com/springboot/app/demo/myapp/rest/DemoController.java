package com.springboot.app.demo.myapp.rest;

import com.springboot.app.demo.myapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController{
	private Coach myCoach;
	private Coach anotherCoach;

	// setter method
	@Autowired // Tells Spring to inject a dependency,
	// if we have only 1 Constructor, then, this annotation is optional
//	public void setCoach(@Qualifier("tennisCoach") Coach theCoach){
	public DemoController(
			@Qualifier("trackCoach") Coach theCoach)
//			@Qualifier("trackCoach") Coach theAnotherCoach)
	{
		System.out.println("In constructor : " + getClass().getSimpleName());
		myCoach = theCoach;
//		anotherCoach = theAnotherCoach;
	}

	@GetMapping("/dailyworkout")
	public String getDailyWorkout(){
		return myCoach.getDailyWorkout();
	}

	//	Scope of spring bean
/*	@GetMapping("/check")
	public String check(){
		return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
	}	*/
}
