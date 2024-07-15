package com.srivath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srivath.databind.User;
import com.srivath.rest.WelcomeRestController;

@SpringBootApplication
public class SbRest04FirstRestApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbRest04FirstRestApiApplication.class, args);
		System.out.println("IOC Container name = " + context.getClass());
		
		System.out.println(context.getBean(WelcomeRestController.class));
		
//		WelcomeRestController controller = context.getBean(WelcomeRestController.class);
//		System.out.println(controller.welcome());
//		System.out.println(controller.greet());
//		System.out.println(controller.demoPost());
//		System.out.println(controller.saveUser(new User(1,"Ram","abc.com")));

	}

}
