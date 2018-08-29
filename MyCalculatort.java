package com.loga.day5;

public class MyCalculatort {
public long power(int n,int p)throws Exception
 {
	 if(n==0 && p==0)
	 {
		 throw new ZeroException("n and p should not be zero");
	 }
	 else if(n<0 || p<0)
	 {
		 throw new NegativeNumberException("n or p should not be negative");
	 }
	 else
	 {
		 return (long) Math.pow(n, p);
	 }
		 
 }
}
