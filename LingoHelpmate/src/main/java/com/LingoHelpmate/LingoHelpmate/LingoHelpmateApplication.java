package com.LingoHelpmate.LingoHelpmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LingoHelpmateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LingoHelpmateApplication.class, args);
	}

}
