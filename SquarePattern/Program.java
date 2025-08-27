package com.java;
import java.util.*;

public class Program {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size of square: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                // print star at boundary
	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}

