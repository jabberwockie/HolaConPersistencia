package com.nisum.onboarding.hw;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class TestHw {

	private Greeting iorana=new Greeting();
	
	@Test
	public void checkInstanceGreeting(){
		assertNotNull(iorana);
	}

	@Test
	public void checkName(){
		//arrange
		iorana.setName("Juan");
		
		assertThat(iorana.getName(), is("Juan"));
	}
	
	@Test
	public void checkReturnGreeting(){
		
		assertThat(iorana.sayHello("Juan"), is("Hello, Juan!"));
	}
	
	@Test
	public void checkLog(){
		assertNotNull(new Log());
	}
	
	
	
}
