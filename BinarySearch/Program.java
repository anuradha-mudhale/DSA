package com.program;

import java.util.Scanner;

public class Program {

    int BinarySearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        Program obj = new Program();
        int res = obj.BinarySearch(arr, size, key);

        if (res != -1) {
            System.out.println("Key found at index: " + res);
        } else {
            System.out.println("Key not found.");
        }

        sc.close();
    }
}
