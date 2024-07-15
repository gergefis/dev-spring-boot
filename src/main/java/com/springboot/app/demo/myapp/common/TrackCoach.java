package com.springboot.app.demo.myapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component : Mark the class as a spring bean
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach{

//	Constructor
	public TrackCoach() {
		System.out.println("In Constructor: " + getClass().getSimpleName());

	}

//54. bean lifecycle Method - BEGIN
	//	Define our init method
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("In doMyStartupStuff() : " + getClass().getSimpleName());
	}

	//	Define our destroy method
	@PreDestroy //54. bean lifecycle Method
	public void doMyCleanupStuff(){
		System.out.println("In doMyCleanupStuff() : " + getClass().getSimpleName());
	}
//54. bean lifecycle Method - END

	@Override
	public String getDailyWorkout(){
		return "Run a hard 5k!";
	}
}
