package io.hari.micro.quarkus.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

	public String greeting(String name) {
		return "Hello, " + name;
	}
	
}
