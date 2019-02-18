package c06_UseAssert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestAssertions {

	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		System.out.println("begin to test assertions...");
		assertEquals(str1, str2);
		
		assertTrue(val1 < val2);
		
		assertFalse(val1 > val2);
		
		assertNotNull(str1);
		
		assertNull(str3);
		
		assertSame(str4, str5);
		
		assertNotSame(str1, str3);
		
		assertArrayEquals(expectedArray, resultArray);
		System.out.println("end testing assertions");
	}
}
