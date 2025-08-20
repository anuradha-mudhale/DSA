package com.java;

import java.util.Scanner;

public class Program {
	public static int findSecondLargestElementInArray(int arr[],int size)
	{
		int largest = -1;
		int secondLargest = -1;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest = largest;
				largest = arr[i];
					
			}
			else if(arr[i]<largest && arr[i]>secondLargest)
			{
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findSecondLargestElementInArray(arr,size)); 
		
	}

}
