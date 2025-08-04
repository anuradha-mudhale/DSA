package com.program;

import java.util.Scanner;

public class Program {
	public static void reverseArray(int arr[],int size)
	{
		int start = 0;
		int end = size-1;
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
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
		
		reverseArray(arr,size);
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
