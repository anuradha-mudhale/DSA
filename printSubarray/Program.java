package com.java;

import java.util.Scanner;

public class Program {
	public static void printSubarray(int arr[],int size)
	{
		int ts=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i;j<size;j++)
			{
				int curr_sum = 0;
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				ts++;
				System.out.println();
			}
			
		}
		System.out.println(ts);
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
		 printSubarray(arr,size);

	}

}
