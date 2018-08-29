package com.loga.day5.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.loga.day5.AgeNotWithinRangeException;
import com.loga.day5.NameNotValidException;
import com.loga.day5.Student;

class StudentTest  {

	Student s1;
	
	@BeforeEach
	void setup()
	{
		s1 = new Student() ;
	}
	
	

	@Test
	void testStudent() throws Exception {
		
			assertEquals(18,s1.ageStudent(18));
			
			assertThrows(AgeNotWithinRangeException.class,()-> s1.ageStudent(12));
			
			assertEquals("Abi",s1.nameStudent("Abi"));
			
			assertThrows(NameNotValidException.class,()->s1.nameStudent("d7%jg4"));
			/*assertEquals(243,c1.power(3, 5));
			assertEquals(243,c1.power(3, 5));*/
		
		
		
	}



	



	


	
	
}
