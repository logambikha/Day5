package com.loga.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.loga.day5.MyCalculatort;


class MyCalculatortTest {

	MyCalculatort c1;
	
	@BeforeEach
	void setup()
	{
		c1 = new MyCalculatort() ;
	}
	
	

	@Test
	void testPower() {
		try 
		{
			assertEquals(243,c1.power(3, 5));
			assertEquals(16,c1.power(2, 4));
			assertThrows(ZeroException.class,()-> c1.power(0, 0));
			assertThrows(NegativeNumberException.class,()->c1.power(-5, -1));
			/*assertEquals(243,c1.power(3, 5));
			assertEquals(243,c1.power(3, 5));*/
		}
		catch(Exception e)
		{
			e.getMessage() ;
		}
		
		
	}
	

}
