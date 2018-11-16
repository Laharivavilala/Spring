package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBookConfig {
	@Bean
	public Author author() {
		
		return new Author("lahari", "Hyderabad");
		
	}
	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	public Book book() {
		Book book = new Book();
		book.setIsbn("xyz");
		book.setYear("2018");
		book.setAuthor(author());
		return book;
		
	}
	
	
	
}
