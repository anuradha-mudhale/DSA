package com.java;

import java.util.Scanner;

public class Program {
	public static void SelectionSort(int arr[],int size)
	{
		
		for(int i=0;i<size-1;i++)
		{
			int minPos = i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[minPos]>arr[j])
				{
					minPos = j;
				}
			}
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i]=temp;
			
			
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
		SelectionSort(arr,size);
		printArr(arr,size);

	}

}
