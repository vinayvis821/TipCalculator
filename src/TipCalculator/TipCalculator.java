package TipCalculator;

import java.util.Scanner;

public class TipCalculator 
{
	public static double amount( Scanner key )
	{
		System.out.println( "Enter the total cost of your bill including taxes: " );
		double amount = key.nextDouble();
		while( amount <= 0 )
		{
			System.out.println( "Enter the total cost of your bill including taxes (bill has to be non-zero and positive: " );
			amount = key.nextDouble();
		}
		return amount;
	}
	public static double tip( Scanner key, Bill bill )
	{
		double amount = bill.getAmount();
		double tenPercent = amount * .10;
		double fifteenPercent = amount * .15;
		double twentyPercent = amount * .20;
		
		System.out.println( "Your total bill including taxes is $" + amount );
		System.out.println();
		System.out.println( "Your total with a 10% tip is $" + (amount+tenPercent) + " (10% tip = $" + tenPercent + ")");
		System.out.println( "Your total with a 15% tip is $" + (amount+fifteenPercent) + " (15% tip = $" + fifteenPercent + ")");
		System.out.println( "Your total with a 20% tip is $" + (amount+twentyPercent) + " (20% tip = $" + twentyPercent + ")");
		System.out.println();
		
		System.out.println( "What percent tip would you like to give? " );
		double percent = key.nextDouble();
		while( percent < 0 )
		{
			System.out.println( "What percent tip would you like to give? (Must be positive)" );
			percent = key.nextDouble();
		}
		double percentAsDec = percent / 100;
		return percentAsDec;
	}
	public static int split( Scanner key )
	{
		System.out.println( "How many people are splitting the bill? " );
		int people = key.nextInt();
		while( people <= 0 )
		{
			System.out.println( "How many people are splitting the bill? (Enter a positive non-zero number)" );
			people = key.nextInt();
		}
		return people;
	}
	public static void main( String [] args )
	{
		Scanner key = new Scanner( System.in );
		Bill bill = new Bill();
		bill.setAmount( amount(key) );
		bill.setTipPercent( tip(key,bill) );
		bill.setSplits( split(key) );
		System.out.println( bill );
	}
}
