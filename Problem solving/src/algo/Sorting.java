package algo;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) throws Exception {
		int[] arr = { 2, 4, 1, 6, 8, 5, 3, 7 };
//		int[] arr = { 4, 2, 3, 1 };
//		mergeSort(arr);
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
		Object[] obj = new Object[5];
		obj[1] = new Node(1, 100);
	}

	static class Node {
		int priority;
		int data;

		public Node(int priority, int data) {
			this.priority = priority;
			this.data = data;
		}
		
	}

	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int left, int right) {

		if (left >= right) {
			return;
		}

		int pivot = arr[(left + right) / 2];

		int index = partition(arr, left, right, pivot);
		quickSort(arr, left, index - 1);
		quickSort(arr, index, right);
	}

	private static int partition(int[] arr, int left, int right, int pivot) {
		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	private static void mergeSort(int[] arr) {
		int len = arr.length;
		if (len < 2) {
			return;
		}
		int mid = len / 2;
		int left[] = new int[mid];
		int right[] = new int[len - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}

		for (int i = mid; i < len; i++) {
			right[i - mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, arr);
	}

	private static int[] merge(int left[], int right[], int[] arr) {
		int i = 0, j = 0, k = 0;
		int leftLen = left.length, rightLen = right.length;

		while (i < leftLen && j < rightLen) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < leftLen) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < rightLen) {
			arr[k] = right[j];
			j++;
			k++;
		}
		return arr;
	}

}
