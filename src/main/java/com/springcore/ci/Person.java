package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certifiacate certificate;
	private List<String> phones;
	
	public Person(String name, int personId, Certifiacate certificate,List<String> phones) {
		this.name = name;
		this.personId = personId;
		this.certificate =certificate;
		this.phones=phones;
	}

	@Override
	public String toString() {
		return this.personId+""+" : "+this.name+"{"+this.certificate+"}"+this.phones.get(0);
	}
}
