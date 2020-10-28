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
	@Test
	public void testUnlimitedValues()
	{
		stringCalculator = new StringCalculator();
		assertEquals(28,stringCalculator.Add("4,3,2,8,9,2"));
	}
	
	@Test
	public void testValuesWithNewline()
	{
		stringCalculator = new StringCalculator();
		assertEquals(30,stringCalculator.Add("4\n3,2\n8,9,4"));
	}
}
