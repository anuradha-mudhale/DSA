package getMinDiff;
import java.util.Arrays;

public class Program {

	    public int getMinDiff(int[] arr, int k) {
	        int n = arr.length;
	        Arrays.sort(arr);

	        int res = arr[n-1] - arr[0];

	        for (int i = 1; i < n; i++) {
	            if (arr[i] - k < 0) {
	                continue;   // फक्त skip करतो, खालील code या iteration ला चालणार नाही
	            }

	            int MinH = Math.min(arr[0] + k, arr[i] - k);
	            int MaxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);

	            res = Math.min(res, MaxH - MinH);
	        }

	        return res;
	    }

	    public static void main(String[] args) {
	        Program sol = new Program();
	        int[] arr = {12, 6, 4, 15, 17, 10};
	        int k = 6;
	        System.out.println(sol.getMinDiff(arr, k));  // Output: 8
	    }
	}


