package pivoteInRotatedArray;

import java.util.Scanner;

public class Program {
	public static int SearchInRotatedArray(int nums[], int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left part sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right part sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.println("Enter array elements sorted order:");
		for(int i = 0;i<size;i++)
		{
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter target:");
		int target = sc.nextInt();
		int result = SearchInRotatedArray(nums, target);

        if (result != -1) {
            System.out.println("Target found at index " + result);
        } else {
            System.out.println("Target not found");
        }
	}

}
