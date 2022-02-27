package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certifiacate certificate;
	
	public Person(String name, int personId, Certifiacate certificate) {
		this.name = name;
		this.personId = personId;
		this.certificate =certificate;
	}

	@Override
	public String toString() {
		return this.personId+""+" : "+this.name+"{"+this.certificate+"}";
	}
}
