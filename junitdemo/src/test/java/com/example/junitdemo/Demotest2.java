package com.example.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class Demotest2 {
	/*Mathematics math;
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
	public void DividebyZero() {
		
	}*/
	@Disabled
	@ParameterizedTest
	@ValueSource(ints = {1, 3, 8, -3, 15, Integer.MAX_VALUE}) // six numbers
	void isOdd_ShouldReturnTrueForOddNumbers(int number) {
	    assertTrue(Mathematics.isOdd(number));
	}

	@Disabled
	@ParameterizedTest
	@ValueSource(strings = {"", "test"})
	void isBlank_ShouldReturnTrueForNullOrBlankStrings(String input) {
	    assertTrue(Mathematics.isBlank(input));
	}
	
	
	@ParameterizedTest
	@CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
	void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
	    String actualValue = input.toLowerCase();
	    assertEquals(expected, actualValue);
	}

	
	@Disabled
	@ParameterizedTest
	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
	void toUpperCase_ShouldGenerateTheExpectedUppercaseValueCSVFile(
	  String input, String expected) {
	    String actualValue = input.toUpperCase();
	    assertEquals(expected, actualValue);
	}



	@Test
	@Tag("smoke")
	@Order(3)
	@Disabled
	void ant() {
		System.out.println("Inside Order-3");
	}
	
	
	
	@Test
	@Tag("sanity")
	@Order(2)
	@Disabled
	void zebra() {
		System.out.println("Inside order-2 ");
	}
	
	@Test
	@Tag("sanity")
	@Order(1)
	@Disabled
	void mango() {
		System.out.println("Inside order -1 ");
	}
	
	@Test
	@Tag("sanity")
	@Order(1)
	@Disabled
	void birds() {
		System.out.println("Inside Birds Method with order=1 ");
	}

}
