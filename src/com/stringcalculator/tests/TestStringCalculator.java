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
		assertEquals(stringCalculator.Add(""),0);
		
	}
	@Test
	public void testSingleValue()
	{
		stringCalculator = new StringCalculator();
		assertEquals("1",1);
	}
}
