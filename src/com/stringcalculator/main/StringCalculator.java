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
			int sum = Integer.parseInt(arrNum[0])+Integer.parseInt(arrNum[1]);
			return sum;
		}
	}

}
