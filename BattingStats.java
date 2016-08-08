package com.day.two.one;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingStats 
{
	private static boolean isBatting = true;

	public static void main(String[] args) 
	{
		while (isBatting == true) 
		{
			DecimalFormat numberFormat = new DecimalFormat("#.000");

			Scanner batterUp = new Scanner(System.in);
			System.out.println("Please enter the number of at-bats.");
			double userInput = batterUp.nextDouble();
			
			if (userInput < 0)
			{
				System.out.println("At-bats cannot be negative.");
				continue; 
			} 
			
			else
			{
				System.out.println(
						"The player was up at bat " + userInput + " times. How many times did they hit the ball?");

				double userInputTwo = batterUp.nextDouble();
				
				if (userInputTwo < 0) 
				{
					System.out.println("Number of hits cannot be negative.");
					continue;
										
				} 
				if (userInputTwo > userInput)
				{
					System.out.println("Hits cannot be greater than at bats.");
					continue; 
				}
				
				else
				{
					double battingAvg = (userInputTwo / userInput) * 100;
					System.out.println("The players batting average is " + (numberFormat.format(battingAvg)) + "%.");

					System.out.println("\nPlease enter the number of bases the player took.");
					double userInputThree = batterUp.nextDouble();
					if(userInputThree < 0)
					{
						System.out.println("Number of bases cannot be negative.");
						continue; 
					}
					double slugPercentage = (userInputThree / userInput) * 100;
					System.out.println(
							"The player's slugging percentage is " + (numberFormat.format(slugPercentage)) + "%.\n");
				}
			}
		}
	}
}
