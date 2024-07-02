package com.springboot.app.demo.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@SpringBootApplication	(	scanBasePackages = {
		"com.springboot.app.demo.myapp",
		"com.springboot.util" ,
	"com.example.util",
	"com.acme.cart",
	"com.cmu.srs",
})*/
@SpringBootApplication
public class MyappApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyappApplication.class, args);
	}
}
