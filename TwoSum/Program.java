package com.java;

import java.util.Scanner;

public class Program {
    public static int[] TwoSum(int arr[], int target) {
        int nums[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (target == arr[i] + arr[j]) {
                    nums[0] = i;
                    nums[1] = j;
                    return nums;
                }
            }
        }
        return null;
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

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int[] result = TwoSum(arr, target); 
        if (result != null) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements sum up to the target.");
        }
    }
}
