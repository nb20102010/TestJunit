package c11_TimeoutTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class TestJunit1 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(timeout = 100)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		for(int i = 0; i < 1000; i++) {
			assertEquals(message, messageUtil.printMessage());
			
		}
	}
}
