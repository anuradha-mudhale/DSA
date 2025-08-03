package com.program;

import java.util.Scanner;

public class program {
	int largestInArray(int arr[],int size)
	{
		int largest = arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
				
			}
			
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		program obj = new program();
		int res= obj.largestInArray(arr,size);
		System.out.println(res);
	}

}
