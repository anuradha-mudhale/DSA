package com.java;

import java.util.Scanner;

public class program {
	public static int BuySellStock(int prices[],int size)
	{
	  int BuyPrice = Integer.MAX_VALUE;
	  int maxProfit = 0;
	  
	  for(int i=0;i<size;i++)
	  {
		  if(BuyPrice<prices[i])
		  {
			 int profit = prices[i]-BuyPrice;
			 maxProfit = Math.max(maxProfit, profit);
		  }
		  else
		  {
			  BuyPrice = prices[i];
		  }
		
	  }
	  return maxProfit;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int prices[]=new int[size];
		System.out.println("Enter perday stock prices:");
		for(int i=0;i<size;i++)
		{
			prices[i] = sc.nextInt();
		}
		System.out.print(BuySellStock(prices,size));

	}

}
