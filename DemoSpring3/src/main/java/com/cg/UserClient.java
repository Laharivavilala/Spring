package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("details.xml"); 
		User user = (User) factory.getBean("User");
		String username = user.getUsername();
		String password = user.getPassword();
		System.out.println(username);
		System.out.println(password);

	}

}
