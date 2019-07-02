package com.sample.crud;

class ExceptionHandling {
	 public static void main(String args[]) {
	  int d = 0;
	  int n = 20;
	  try {
	   int fraction = n / d;
	   System.out.println("This line will not be Executed");
	  } catch (ArithmeticException e) {
	   System.out.println("In catch Block due to Exception = " + e);
	  }
	  finally {
		  System.out.println("End of the program");
	  }
	 }
	}