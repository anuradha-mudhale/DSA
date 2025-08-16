package com.java;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class program {
	public static void printArr(Integer arr[],int size)
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
		Integer arr[] = new Integer[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		//Arrays.sort(arr,0,3);
		//Arrays.sort(arr,Collections.reverseOrder());
		Arrays.sort(arr,0,3,Collections.reverseOrder());
		printArr(arr, size);
		
		
	}

}
