package com.nisum.onboarding.hw;

public class Greeting {
	
	private String name;
	

	public void setName(String string) {
		name=string;	
	}

	public String getName(){
		return name;
	}
	
	
	public String sayHello(String name){
		return "Hello, "+name+"!";
	}

	
}
