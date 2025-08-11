package checkArrayElementAppearTwice;

import java.util.Scanner;

public class Program {
	public static boolean checkArrayElementAppearTwice(int nums[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(nums[i]==nums[j])
				{
					return true;
				}
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.println("Enter array elements:");
		for(int i = 0;i<size;i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println( checkArrayElementAppearTwice(nums,size));
	}

}
