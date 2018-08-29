package com.loga.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	int rollNo;
    String name;
    int age;
    String course;
   
   public Student() {
	   
   }
    
   public Student(int rollNo, String name, int age, String course)
   {
	  this.rollNo= rollNo;
	  this.name= name;
	  this.age= age;
	  this.course= course;
   }
	public int ageStudent(int age) throws Exception
	{
		if(age<15 && age>21) {
			throw new AgeNotWithinRangeException("AgeNotWithinRangeException");
		}
		else {
			return age;
		}
	}
		public String nameStudent(String name) throws Exception
	{
		Pattern pattern=Pattern.compile("[a-zA-Z");
		Matcher matcher = pattern.matcher(name);
	       if (!matcher.matches()) {
	           throw new NameNotValidException("NameNotValidException");
	      } else {
            return name;	      }
	}
	
	

}
