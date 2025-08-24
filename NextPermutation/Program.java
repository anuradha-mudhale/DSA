package com.java;
import java.util.Arrays; 
public class Program {
	public static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the pivot (rightmost element arr[i] < arr[i+1])
        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If pivot not found, array is in descending order
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find successor (rightmost element greater than pivot)
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse suffix (pivot+1 to end)
        reverse(arr, pivot + 1, n - 1);
    }

    // Utility: swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Utility: reverse subarray from start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        nextPermutation(arr1);
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 5, 4]

        int[] arr2 = {1, 2, 3, 5, 4};
        nextPermutation(arr2);
        System.out.println(Arrays.toString(arr2)); // [1, 2, 4, 3, 5]

        int[] arr3 = {1, 2, 3, 6, 5, 4};
        nextPermutation(arr3);
        System.out.println(Arrays.toString(arr3)); // [1, 2, 4, 3, 5, 6]

        int[] arr4 = {3, 2, 1};
        nextPermutation(arr4);
        System.out.println(Arrays.toString(arr4)); // [1, 2, 3]
    }
}
