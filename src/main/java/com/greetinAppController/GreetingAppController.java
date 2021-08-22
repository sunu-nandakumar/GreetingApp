package com.greetinAppController;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.greetinAppModel.GreetingModel;
import com.greetinAppService.GreetingAppService;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
	private static final String template = "Hello, %s!";
	// AtomicLong is class and it is used to Automatically increment the sequence
	// number.
	private final AtomicLong counter = new AtomicLong();
	@Autowired
    private GreetingAppService greetingService;

	@GetMapping(value = { "/", "", "home" })
	public GreetingModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GreetingModel(counter.incrementAndGet(), String.format(template, name));
	}
	 

	    
	    @GetMapping(value = "/getMessage")
	    public ResponseEntity<String> getMessage() {
	        return new ResponseEntity<String>(greetingService.getMessage(), HttpStatus.OK);
	    }
}
