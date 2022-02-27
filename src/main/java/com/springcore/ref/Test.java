package com.springcore.ref;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A a = (A) context.getBean("aref");
		
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		System.out.println(a);

	}

}
