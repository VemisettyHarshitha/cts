package com.example.junitdemo;

public class Mathematics {
   public int add(int a,int b)
   {
	   return a+b;
   }
   public int divide(int a,int b) {
	   return a/b;
   }
   public static boolean isOdd(int number) {
       return number % 2 != 0;
   }
	
	public static boolean isBlank(String input) {
       return input == null || input.trim().isEmpty();
   }
}
