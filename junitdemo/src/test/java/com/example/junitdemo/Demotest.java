package com.example.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class Demotest {
	Mathematics math;
	
	@BeforeAll
	public static void setup() {
		System.out.println("Before All");
	}
	@AfterAll
	public static void destroy() {
		System.out.println("After All");
	}

	@BeforeEach
	public  void createMathsObject() {
		math=new Mathematics();
		System.out.println("Before the test");
	}
	@AfterEach
	public void RemoveMathsObject () {
		math=null;
		System.out.println("After the test");
	}
	@Test
	public void WhenBothArePositive() {
		System.out.println("inside the test method1");
		assertEquals(10,math.add(5, 5));
	}
	@Test
	public void WhenBothAreNegative() {
		System.out.println("inside the test method2");
		assertEquals(-10,math.add(-5, -5));
	}
	@Test
	@Tag("smoke")
	public void WhenOnePositiveOneNegative() {
		System.out.println("inside the test method3");
		assertEquals(0,math.add(5, -5));
	}
	@Test
	public void WhenBothAreZero() {
		System.out.println("inside the test method4");
		assertEquals(0,math.add(0, 0));
	}
	@Test
    @Tag("sanity")
 	public void testDivide() {
		//Mathematics math = new Mathematics();
    	System.out.println("Inside the test method - Divide");
		assertEquals(2, math.divide(10, 5));
	}

  
    @Test
        public void testDivideByZero() {
    	      //  Mathematics math = new Mathematics();
    	System.out.println("Inside the test method - Divide by Zero Exception");
    	        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    	}


}
