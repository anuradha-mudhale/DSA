package com.java;

class Solution {
    int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProd = Integer.MIN_VALUE;
        int leftToRight = 1;
        int rightToLeft = 1;
        
        for(int i = 0; i < n; i++) {
            if(leftToRight == 0)
                leftToRight = 1;
            if(rightToLeft == 0)
                rightToLeft = 1;
                
            leftToRight *= arr[i];
            int j = n - i - 1;
            rightToLeft *= arr[j];
            
            maxProd = Math.max(leftToRight, Math.max(rightToLeft, maxProd));
        }
        return maxProd;
    }
}

public class Program {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr1 = {2, 3, -2, 4};     // Expected output = 6
        int[] arr2 = {-2, 0, -1};       // Expected output = 0
        int[] arr3 = {-2, -3, 7};       // Expected output = 42
        
        System.out.println("Max Product of arr1: " + sol.maxProduct(arr1));
        System.out.println("Max Product of arr2: " + sol.maxProduct(arr2));
        System.out.println("Max Product of arr3: " + sol.maxProduct(arr3));
    }
}
