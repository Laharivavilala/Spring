package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("details.xml");
		Employee employee = (Employee) ctx.getBean("Employee");
		/*System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getSalary());
		System.out.println(employee.getBusinessUnit());
		System.out.println(employee.getSBUDetails());
*/
System.out.println(employee);
System.out.println(employee.getSBUDetails());


	}

}
