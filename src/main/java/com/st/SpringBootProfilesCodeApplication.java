package com.st;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.st.service.INotificationService;

@SpringBootApplication
public class SpringBootProfilesCodeApplication implements CommandLineRunner {
		
	@Autowired
	private INotificationService service;
		
	@Override
	public void run(String... args) throws Exception {
		service.notified();
			
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesCodeApplication.class, args);
	
		
	}

}
