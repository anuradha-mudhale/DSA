package com.java;

import java.util.Scanner;

public class Program {
	public static void pushZerosToEnd(int arr[],int size)
	{
		int count = 0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]!=0)
			{
				int temp = arr[count];
				arr[count]=arr[i];
				arr[i]=temp;
				
				count++;
			}
		}
		for (int num : arr) {
            System.out.print(num + " ");
        }
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		pushZerosToEnd(arr, size);

        sc.close();
		
	}

}
