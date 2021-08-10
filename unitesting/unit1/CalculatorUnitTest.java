package unitesting.unit1;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CalculatorUnitTest {
	private static Calculator calculator;
	public static final double EPSILON_DOUBLE = 0.000001d;
	
	
	@Before
	public void setupOnce() {
		this.calculator = new Calculator(0.0d);
	}
	
	@After
	public void teardownOnce() {
		this.calculator = null;
	}
	
	
	@Test(timeout = 10)
	public void testAddFunctionZero() {
		calculator.add(0);
		assertEquals(0.0, 0.0,this.EPSILON_DOUBLE);

	}
	
	@Test
	public void testAddFunctionPositiveNum() {
		calculator.add(15.88);
		calculator.add(10.01);
		assertEquals(25.89, calculator.getValue(),this.EPSILON_DOUBLE);
	}
	
	@Test
	public void testSubtract() {
		calculator.add(55.18);
		calculator.subtract(5.15);
		assertEquals(50.03, calculator.getValue(),this.EPSILON_DOUBLE);
		
	}

}
