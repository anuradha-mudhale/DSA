package kadanesAlgorithm;

import java.util.Scanner;

public class program {
	public static int MaxSubArraySum1(int arr[],int size)
	{
		int cs=0;
		int ms=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			cs = cs+arr[i];
			if(cs<0)
			{
				cs=0;
			}
			ms = Math.max(cs, ms);
			
		}
		return ms;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size");
	        int size = sc.nextInt();

	        int arr[] = new int[size];
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int res = MaxSubArraySum1(arr,size);
	        System.out.println(res);

	}
	}

	