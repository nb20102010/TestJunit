package c02_TestFrame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJunit2 {
	
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
	
}