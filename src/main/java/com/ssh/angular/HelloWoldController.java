package com.ssh.angular;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWoldController {
	//GET
	// URI - /hello-world
	// method - "Hello World"
	//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	
	// hello world bean
	@GetMapping(path = "hello-world-bean")
	public HelloWorlBean helloWorldBean() {
		return new HelloWorlBean("Hello World Service");
	}
	
	// hello-world/path-variable/shwesin
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorlBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorlBean(String.format("Hello World, %s", name));
	}
	

}
