package com.firstStep.communication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "resources")
public class CommunicationDemoApplication {

	@RequestMapping("/")
	public String home()
	{
		return "Hello World";
	}

	public static void main(String[] args)
	{
		SpringApplication.run(CommunicationDemoApplication.class, args);
	}

}
