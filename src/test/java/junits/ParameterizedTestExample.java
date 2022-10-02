package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample {
	
	@ValueSource(strings = {"radar","mom","dad"})
	@ParameterizedTest
	public void Test1(String arg1) {
		
		assertTrue(StringFunctions.isPalindrome(arg1));
	}
	
	@CsvSource(value = {"radar:radar:this is a comparison test"}, delimiter = ':')
	@ParameterizedTest
	public void Test2(String arg1, String arg2, String arg3) {
		
		assertEquals(arg1,arg2,arg3);
		
		System.out.println(arg3);
	}

}
