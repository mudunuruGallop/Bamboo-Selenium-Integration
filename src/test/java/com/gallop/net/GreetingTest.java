package com.gallop.net;

import org.testng.annotations.Test;
import org.testng.Assert;

public class GreetingTest {
	
	@Test
	public void testHello(){
		Greeting greeting = new Greeting();
		Assert.assertEquals(greeting.sayHello("Chandra"),"Hello,Chandra");
	}

}
