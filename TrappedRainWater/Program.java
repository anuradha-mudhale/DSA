package com.java;

import java.util.Scanner;

public class Program {
	public static int TrappedRainWater(int height[],int size)
	{
		//calculate left max boundary array
		int leftMax[] = new int[size];
		leftMax[0] = height[0];
		for(int i=1;i<size;i++)
		{
			leftMax[i] = Math.max(height[i], leftMax[i-1]); 
		}
		//calculate right max boundary array
		int rightMax[] = new int[size];
		rightMax[size-1]=height[size-1];
		for(int i=size-2;i>=0;i--)
		{
			rightMax[i] = Math.max(height[i],rightMax[i+1]);
		}
		
		int trappedWater = 0;
		//loop
		for(int i=0;i<size;i++)
		{
			//waterlevel = min(leftmax bound,rightmax bound)
			int waterlevel = Math.min(leftMax[i], rightMax[i]);
			
			//trapped water = waterlevel - height[i]
			trappedWater+=waterlevel-height[i];
			
		}
		
	return trappedWater;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		System.out.println("Enter height of bar");
		int height[] = new int[size];
		for(int i=0;i<size;i++)
		{
	    	height[i]= sc.nextInt();
		}
		System.out.println(TrappedRainWater(height,size));
	}

}
