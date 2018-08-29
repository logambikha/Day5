package com.loga.day5;

public class TaxCalulator {

	public static double taxAmount;
	public static double calculateTax(String empName,boolean isIndian, double empSal)throws Exception
	{
		if(empName== " " && empName == null)
			throw new EmployeeNameInvalidException("EmployeeNameInvalidException");
		if(isIndian)
			throw new CountryNotValidException("CountryNotValidException");
		if(empSal>100000)
			return taxAmount=empSal*0.08;
		if(empSal<100000 && empSal>50000)
			return taxAmount=empSal*0.06;
		if(empSal<50000 && empSal>30000)
			return taxAmount=empSal*0.05;
		if(empSal<30000 && empSal>10000)
			return taxAmount=empSal*0.04;
		else
			throw new TaxNotEligibleEception("TaxNotEligibleEception");
	}
}
