package com.java;

import java.util.Scanner;

public class Program {
	public static void BubbleSort(int arr[],int size)
	{
		for(int turn=0;turn<size-1;turn++)
		{
			for(int j=0;j<size-1-turn;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
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
		BubbleSort(arr,size);
		printArr(arr,size);
		
		
	}

}
