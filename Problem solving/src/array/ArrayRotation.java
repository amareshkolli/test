package array;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = new int[5];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = count;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		rotateRight(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			start++;
			end--;
		}
	}

	private static void rotateRight(int arr[], int k) {
		int n = arr.length;
		k %= n;
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);
	}

//	private static void rotateSpaceComplexity(int[] nums, int k) {
//		int n = nums.length;
//		k %= n;
//		reverse(nums, 0, n - 1);
//		reverse(nums, 0, k - 1);
//		reverse(nums, k, n - 1);
//	}
//
//	public static void reverse(int[] nums, int start, int end) {
//		while (start < end) {
//			int temp = nums[start];
//			nums[start] = nums[end];
//			nums[end] = temp;
//			start++;
//			end--;
//		}
//	}

//	static void rightRotate(int[] arr, int d) {
//		int temp = 0;
//		for (int j = 0; j < d; j++) {
//			temp = arr[arr.length - 1];
//			for (int i = arr.length - 1; i > 0; i--) {
//				arr[i] = arr[i - 1];
//			}
//			arr[0] = temp;
//		}
//	}

	static void leftRotate(int[] arr, int k) {
		int temp = 0;
		for (int i = 0; i < k; i++) {
			temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
	}

//	static int[] rotLeft(int[] a, int d) {
//
//		int temp = 0;
//		for (int i = 0; i < d; i++) {
//			temp = a[0];
//			for (int j = 0; j < a.length - 1; j++) {
//				a[j] = a[j + 1];
//			}
//			a[a.length - 1] = temp;
//		}
//		return a;
//	}
//
//	static int[] rotateUsingNewArray(int[] a, int d) {
//		if(d > a.length) {
//			d = d - a.length;
//		} else if ( d == a.length) {
//			return a;
//		}
//		
//		int[] newA = new int[a.length];
//		for (int i = 0; i < a.length - d ; i++) {
//			newA[i] = a[i + d];
//		}
//		for(int i = 0; i < d; i++) {
//			newA[(newA.length - d + i)] = a[i];
//		}
//		System.out.println("new ARR : "+Arrays.toString(newA));
//		return newA;
//	}

}
