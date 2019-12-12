package array;

import java.util.Arrays;

public class DuplicatesInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[] { 1, 1, 2, 2, 3, 4, 4 };
//		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
//		int[] arr = { 0, 1, 0, 3, 12 };
		int[] arr = { 4, 2, 1 };
//		removeDuplicates(arr);
//		removeElement(arr, 2);
//		moveZeroesToStart(arr);
		System.out.println(checkNonDecreasingArrPossibility(arr));
		System.out.println(Arrays.toString(arr));
		swap(arr, 1, 2);
	}

	private static boolean checkNonDecreasingArrPossibility(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				if (i > 0) {
					if (arr[i - 1] <= arr[i + 1])
						arr[i] = arr[i - 1];
					else
						arr[i + 1] = arr[i];
				}
				count++;
				if (count > 1)
					return false;
			}
		}
		return true;
	}

	private static void moveZeroesToStart(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[i] == 0) {
				if (nums[j] != 0) {
					swap(nums, i, j);
					i++;
				}
			} else {
				i++;
			}
		}
	}

	private static void swap(int[] arr, int x, int y) {
		{
			arr[x] = arr[x] + arr[y];
			arr[y] = arr[x] - arr[y];
			arr[x] = arr[x] - arr[y];
		}
	}

	private static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			System.out.println("i : " + i + " j: " + j);
			if (nums[j] != val) {
				System.out.println("replaced " + nums[i] + " with " + nums[j]);
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	private static int removeDuplicates(int[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {

		}
		return i;
	}

//	public static int removeDuplicates(int[] nums) {
//		int j = 0;
//		for (int i = 1; i < nums.length; i++) {
//			System.out.println("i : " + i + " j: " + j);
//			if (nums[i] != nums[j]) {
//				nums[++j] = nums[i];
//			}
//			System.out.println(Arrays.toString(nums));
//		}
//		return j + 1;
//	}

//	public static int removeDuplicates(int[] nums) {
//		if (nums.length == 0)
//			return 0;
//		int i = 0;
//		for (int j = 1; j < nums.length; j++) {
//			System.out.println("i : "+i+" j: "+j);
//			if (nums[j] != nums[i]) {
//				i++;
//				nums[i] = nums[j];
//			}
//			System.out.println(Arrays.toString(nums));
//		}
//		return i + 1;
//	}

}
