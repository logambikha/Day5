package com.loga.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day5.MyCalculator;

class MyCalculatorTest {

	
	@Test
	void testPowerWithZeroInputs() {
		Exception e;
		e= assertThrows(Exception.class, () -> MyCalculator.power(0,0));
		assertEquals("n or p should not be zero",e.getMessage());
	}
	@Test
	void testPowerWithNegativeInputs() {
		Exception e;
		e=assertThrows(Exception.class, () -> MyCalculator.power(-6,7));
		assertEquals("n and p should not be negative",e.getMessage());
		e=assertThrows(Exception.class, () -> MyCalculator.power(-5,-2));
		assertEquals("n and p should not be negative",e.getMessage());
		e=assertThrows(Exception.class, () -> MyCalculator.power(-9,4));
		assertEquals("n and p should not be negative",e.getMessage());
	}

}