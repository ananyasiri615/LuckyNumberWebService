package com.ars;

public class NameInput {

	private String name;

	public NameInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NameInput(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameInput [name=" + name + "]";
	}
	
}