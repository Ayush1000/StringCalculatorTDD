package com.stringcalculator.main;

public class StringCalculator {

	public int Add(String numbers) {
		// TODO Auto-generated method stub
		
		String[] arrNum = numbers.split(",|\n");
		int sum=0;
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
			for(String num:arrNum){
			 sum = getSumValue(sum,num);
			}
			return sum;
		}
	}
	private int getSumValue(int number1,String number2)
	{
		return number1+Integer.parseInt(number2);
	}

}
