package com.ssh.angular.basic.auth;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	//GET
	// URI - /hello-world
	// method - "Hello World"
	//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	
	// hello world bean
	@GetMapping(path = "basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException ("Some Error has Happened");
		 return new AuthenticationBean("You are authenticated!");
	}
	
	

}
