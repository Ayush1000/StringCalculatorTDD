package com.stringcalculator.main;


public class StringCalculator {

	public int Add(String numbers) {
		// TODO Auto-generated method stub
		String delimiter = ",|\n";
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
			if(numbers.contains("//"))
			{
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			String[] arrNum = splitWithDelimiter(numbers,delimiter);
			int sum=0;
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
	private String[] splitWithDelimiter(String numbers, String delimiter)
	{
		return numbers.split(delimiter);
	}
}
