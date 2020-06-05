package in.bitstech.springReactJs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.bitstech.springReactJs.modle.TestData;

@RestController
public class HomeController {

	
	@GetMapping("/hello")
	public Object getHelloWorld()
	{
		return new TestData(1L, "Hello, World!");
	}
}
