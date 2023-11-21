package com.nba.tpwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TpwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpwebserviceApplication.class, args);
	}

}
