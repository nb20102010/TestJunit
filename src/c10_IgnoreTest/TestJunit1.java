package c10_IgnoreTest;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class TestJunit1 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}
}
