package com.java;
import java.util.ArrayList;

	public class Program {
	    public ArrayList<Integer> findMajority(int[] arr) {
	        int n = arr.length;
	        int ele1 = -1, ele2 = -1;
	        int cnt1 = 0, cnt2 = 0;
	        
	        // Pass 1: Find potential candidates
	        for (int ele : arr) {
	            if (ele == ele1) {
	                cnt1++;
	            } else if (ele == ele2) {
	                cnt2++;
	            } else if (cnt1 == 0) {
	                ele1 = ele;
	                cnt1 = 1;
	            } else if (cnt2 == 0) {
	                ele2 = ele;
	                cnt2 = 1;
	            } else {
	                cnt1--;
	                cnt2--;
	            }
	        }
	        
	        // Pass 2: Verify candidates
	        cnt1 = 0;
	        cnt2 = 0;
	        for (int ele : arr) {
	            if (ele == ele1) cnt1++;
	            else if (ele == ele2) cnt2++;
	        }
	        
	        ArrayList<Integer> res = new ArrayList<>();
	        if (cnt1 > n / 3) res.add(ele1);
	        if (cnt2 > n / 3) res.add(ele2);
	        
	        // Sort result if two elements found
	        if (res.size() == 2 && res.get(0) > res.get(1)) {
	            int temp = res.get(0);
	            res.set(0, res.get(1));
	            res.set(1, temp);
	        }
	        
	        return res;
	    }

	    // Main Method
	    public static void main(String[] args) {
	        Program sol = new Program();
	        
	        int[] arr1 = {2, 2, 3, 1, 3, 2, 1, 1};
	        int[] arr2 = {-5, 3, -5};
	        int[] arr3 = {3, 2, 2, 4, 1, 4};

	        System.out.println(sol.findMajority(arr1)); // Output: [1, 2]
	        System.out.println(sol.findMajority(arr2)); // Output: [-5]
	        System.out.println(sol.findMajority(arr3)); // Output: []
	    }
	}

