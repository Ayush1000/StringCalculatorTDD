package com.stringcalculator.main;

public class StringCalculator {

	public int Add(String numbers) {
		// TODO Auto-generated method stub
		String[] arrNum = numbers.split(",");
		if(numbers.isEmpty()||numbers.equals(""))
		{
			return 0;
		}
		else if(numbers.length()==1)
		{
			return Integer.parseInt(numbers);
		}
		else 
		{
			int sum = getSumValue(arrNum[0],arrNum[1]);
			return sum;
		}
	}
	private int getSumValue(String number1,String number2)
	{
		return Integer.parseInt(number1)+Integer.parseInt(number2);
	}

}
