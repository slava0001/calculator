package com.slava0001.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	private Calculator calculator = new Calculator();


	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2, 3));
	}
}