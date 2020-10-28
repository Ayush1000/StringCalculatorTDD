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
			return calculateSum(arrNum);
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
	private int calculateSum(String[] arr)
	{
		int sum=0;
		String negativeNumbers= "";
		for(String num:arr){
			if(Integer.parseInt(num)<0)
			{
				if(negativeNumbers.equals(""))
				{
					negativeNumbers = num;
				}
				else
					
				negativeNumbers+=","+num;
			}
		 sum = getSumValue(sum,num);
		}
		if(negativeNumbers.length()>0)
		{
			throw new IllegalArgumentException("Illegal input: "+negativeNumbers);
		}
		return sum;
	}
}
