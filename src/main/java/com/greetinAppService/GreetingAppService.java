package com.greetinAppService;

import org.springframework.stereotype.Service;

@Service
public class GreetingAppService {
	 private final String template = "Hello, %s %s!";
	public String getMessage() {
		// TODO Auto-generated method stub
		  return "Hello World";
	}

	public String getGreetingMessage(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return String.format(template ,firstName, lastName);
	}

}
