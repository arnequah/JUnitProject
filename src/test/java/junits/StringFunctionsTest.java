package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}
	
	@Test
	public void Test2() {
		
		assertFalse(StringFunctions.isPalindrome("PRIYA"));
	}
	
	@DisplayName("Example of repeated test")
	@RepeatedTest(4)
	public void Test3() {
		
		assertTrue(StringFunctions.isPalindrome("MOM"));
	}

}