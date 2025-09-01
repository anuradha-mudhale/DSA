package missingNumber;

public class Program {
	 public int missingNumber(int[] arr) {
	        int n = arr.length;

	        // Step 1: place each number at its correct position
	        for (int i = 0; i < n; i++) {
	            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
	                // Swap arr[i] with arr[arr[i]-1]
	                int temp = arr[i];
	                arr[i] = arr[temp - 1];
	                arr[temp - 1] = temp;
	            }
	        }

	        // Step 2: find the first index where index+1 != value
	        for (int i = 0; i < n; i++) {
	            if (arr[i] != i + 1) {
	                return i + 1;
	            }
	        }

	        // Step 3: if all numbers from 1 to n are present
	        return n + 1;
	    }

	    // main method for testing
	    public static void main(String[] args) {
	        Program sol = new Program();

	        int[] arr1 = {3, 4, -1, 1};
	        System.out.println(sol.missingNumber(arr1)); // Output: 2

	        int[] arr2 = {1, 2, 0};
	        System.out.println(sol.missingNumber(arr2)); // Output: 3

	        int[] arr3 = {7, 8, 9, 11, 12};
	        System.out.println(sol.missingNumber(arr3)); // Output: 1
	    }
	}
