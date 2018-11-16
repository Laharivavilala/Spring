package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=  (Employee) factory.getBean("Employee");
		System.out.println("Employee Details:");
		System.out.println("-----------------------");
		System.out.println("id: "+employee.getEmployeeId());
		System.out.println("name: "+employee.getEmployeeName());
		System.out.println("salary: "+employee.getSalary());
		System.out.println("Business Unit: "+employee.getBusinessUnit());
		System.out.println("age: "+employee.getAge());
		
		

	}

}
