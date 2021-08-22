package com.greetinAppController;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

import com.greetinAppModel.GreetingModel;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
	private static final String template = "Hello, %s!";
	// AtomicLong is class and it is used to Automatically increment the sequence
	// number.
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value = { "/", "", "home" })
	public GreetingModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GreetingModel(counter.incrementAndGet(), String.format(template, name));
	}
}
