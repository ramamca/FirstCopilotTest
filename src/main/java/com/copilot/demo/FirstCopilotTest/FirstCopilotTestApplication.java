package com.copilot.demo.FirstCopilotTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class FirstCopilotTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstCopilotTestApplication.class, args);
	}

}
