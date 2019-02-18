package c08_ExecutionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
}
