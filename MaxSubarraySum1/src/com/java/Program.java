package com.java;

import java.util.Scanner;

public class Program {
	public static void MaxSubarraySum1(int arr[],int size)
	{
		int maxSum = Integer.MIN_VALUE;

		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				int curr_sum = 0;
				for(int k=i;k<=j;k++)
				{
					curr_sum += arr[k];
				}
				System.out.println(curr_sum);
				if(curr_sum>maxSum)
				{
					maxSum = curr_sum;
				}
				
			}
			
		}
		System.out.println("Maximum sum is:"+maxSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
		 arr[i] = sc.nextInt();
		}
		MaxSubarraySum1(arr,size);
	}

}
