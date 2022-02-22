package com.jgcardelus.simpleServer;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@GetMapping("/helloWorld")
	public HelloWorld getHelloWorld() {
		return new HelloWorld("ok", "helloWorld");
	}
}
