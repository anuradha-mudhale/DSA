package com.java;

public class Program {

	public static void main(String[] args) {
		int n = 5; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }

            // Move to next line
            System.out.println();
        }

	}

}
