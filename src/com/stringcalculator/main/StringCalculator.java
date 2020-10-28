package com.stringcalculator.main;

public class StringCalculator {

	public int Add(String numbers) {
		// TODO Auto-generated method stub
		if(numbers.isEmpty()||numbers.equals(""))
		{return 0;
	}
		else
		{
			return Integer.parseInt(numbers);
		}
	}

}
