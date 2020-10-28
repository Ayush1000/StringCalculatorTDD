package com.stringcalculator.tests;

import org.junit.Test;

import com.stringcalculator.main.StringCalculator;

import static org.junit.Assert.assertEquals;

public class TestStringCalculator {
	StringCalculator stringCalculator;
	
	@Test
	public void testemptyStringReturnsZero()
	{
		stringCalculator = new StringCalculator();
		assertEquals(0,stringCalculator.Add(""));
		
	}
	@Test
	public void testSingleValue()
	{
		stringCalculator = new StringCalculator();
		assertEquals(1,stringCalculator.Add("1"));
	}
	@Test
	public void testTwoValues()
	{
		stringCalculator = new StringCalculator();
		assertEquals(7,stringCalculator.Add("4,3"));
	}
}
