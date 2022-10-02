package pkgA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

@Tag("Sanity")
public class PkgATest {
	
	@Test
	@DisplayName("Part of pkg A")
	public void Test1() {
		
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}
	
	@Test
	@DisplayName("Part of pkg A")
	public void Test2() {
		
		assertTrue(StringFunctions.isPalindrome("RADAR"));
	}

}
