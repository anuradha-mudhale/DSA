package com.java;
import java.util.*;

public class Program {

	public int myAtoi(String s) {
        int sign = 1, res = 0, idx = 0;

        // Step 1: skip leading whitespaces
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }

        // Step 2: check for sign
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx) == '-') {
                sign = -1;
            }
            idx++;
        }

        // Step 3: convert digits
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || 
               (res == Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (s.charAt(idx) - '0');
            idx++;
        }

        return res * sign;
    }

    // Main method to take input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Program sol = new Program();
        int result = sol.myAtoi(input);

        System.out.println("Converted integer: " + result);
    }
}
