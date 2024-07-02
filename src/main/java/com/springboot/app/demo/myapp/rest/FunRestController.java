package com.springboot.app.demo.myapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

// BEGIN	inject properties for: coach,name and team.name
	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;
// END inject properties for: coach,name and team.name

//	Expose new endpoint for "teaminfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo(){
		return "<b> Coach Name:</b> " + "<u>" + coachName + "</u>" +
				"<p><b> Team name: </b>" + "<u>" + teamName + "</u>" + "</p>";
	}


//	Expose "/" that return Hello World!"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}
//	Expose "/" that return workout information
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run hard for 5k!";
	}
//	Expose "/" that return fortune information
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}
}
