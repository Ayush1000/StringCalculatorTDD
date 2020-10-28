package com.stringcalculator.tests;

import org.junit.Test;

import com.stringcalculator.main.StringCalculator;

import static org.junit.Assert.assertEquals;

public class TestStringCalculator {
	
	@Test
	public void emptyStringReturnsZero()
	{
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(stringCalculator.Add(""),0);
		
	}

}
