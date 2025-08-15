package com.java;

import java.util.Scanner;

public class Program {
	public static void InsertionSort(int arr[],int size)
	{
		for(int i=1;i<size;i++)
		{
			int curr = arr[i];
			int prev = i-1;
			while(prev>=0 && arr[prev]>curr)
			{
				arr[prev+1] = arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
	}
	public static void printArr(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		InsertionSort(arr,size);
		printArr(arr,size);

	}
}
