package c12_ExceptionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		int b = 1 / 0;
		assertEquals(message, messageUtil.printMessage());
	}
}
