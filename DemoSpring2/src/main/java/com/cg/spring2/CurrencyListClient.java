package com.cg.spring2;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyListClient {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("currencylist.xml");
		CurrencyList curr = (CurrencyList) factory.getBean("currencyList");
		ArrayList<String> currency = curr.getCurrList();
		System.out.println(currency);

	}

}
