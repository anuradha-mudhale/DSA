package com.java;

public class Program {
    public static void countingSort(int arr[], int size) {
        
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            largest = Math.max(largest, arr[i]);
        }

        
        int count[] = new int[largest + 1];
        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
        }

        
        int j = 0; 
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        int size = arr.length;

        countingSort(arr, size);

    
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
