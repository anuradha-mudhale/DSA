package linearSearch;

import java.util.Scanner;

public class Program {
	
	int linearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter array element to search:");
		int key = sc.nextInt();
		Program obj = new Program();
		int res = obj.linearSearch(arr,key);
		if(res!=-1)
		{
			System.out.println("Array element found at index:"+res);
		}else
		{
			System.out.println("Element not found");
		}
	}

}
