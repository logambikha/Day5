package com.loga.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.loga.day5.CountryNotValidException;
import com.loga.day5.EmployeeNameInvalidException;
import com.loga.day5.TaxCalulator;
import com.loga.day5.TaxNotEligibleEception;

class TaxCalulatorTest {
	TaxCalulator tax;

	@Test
	void testCalculateTaxWithValidInputs()throws Exception {
	assertEquals(16000.0,tax.calculateTax("Ron", true, 200000.0));	
	
	}
	@Test
	void testCalculateEmployeeNameInvalidException() {
		assertThrows(EmployeeNameInvalidException.class,()-> tax.calculateTax(null, true, 30000.0));		
		
		
	}
	@Test
	void testCalculateTaxWithIneligible() {
		assertThrows(TaxNotEligibleEception.class,()-> tax.calculateTax("Tim", true, 1000.0));		
	}
	@Test
	void testCalculateCountryNotValidException() {
		assertThrows(CountryNotValidException.class,()->tax.calculateTax("Ron", false, 34000.0));		
		
	}
		

}
