package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;
	
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	// This method works exactly same as init
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Pepsi: Inisde init");
		
	}

	// This method works exactly same as destroy
	@Override
	public void destroy() throws Exception {
		System.out.println("Pepsi: Inside destroy");
		
	}
	
}
