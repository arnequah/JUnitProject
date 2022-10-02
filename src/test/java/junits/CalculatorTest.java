package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void Test1() {
		
		assertEquals(11,Calculator.Add(5, 6));
		
	}
	
	@Test
	public void Test2() {
		
		assertEquals(10,Calculator.Sub(20, 10));
		
	}

}
