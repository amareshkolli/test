package sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 5, 1, 4, 2 };
//		System.out.println("swaps : " + insertionSort(arr));
//		for (int i : arr) {
//			System.out.println(i);
//		}

//		int[] arr1 = { 1, 2, 1, 2, 1, 2, 3 };
//		int[] arr2 = { 6 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5 };
		solvingQueries(arr1, 5);
//		System.out.println(2 % 3);
	}

//	static int insertionSort(int[] ar) {
//		int swaps = 0;
//		for (int i = 1; i < ar.length; i++) {
//			int index = ar[i];
//			int j = i;
//			while (j > 0 && ar[j - 1] > index) {
//				ar[j] = ar[j - 1];
//				swaps++;
//				j--;
//			}
//			ar[j] = index;
//		}
//		return swaps;
//	}

	public static List<Integer> solvingQueries(int[] a, int m) {
		int[] sarr = new int[m];
		Set<Integer> values = new HashSet<Integer>();
		for (int i = 0; i < sarr.length; i++) {
			sarr[i] = a[i];
			System.out.println(sarr[i]);
		}

		for (int i = 0; i < (m - 1); i++) {
			for (int u = 1; u <= m; u++) {
				if (sarr[i] == sarr[i % u]) {
					values.add(u);
				}
			}
		}

		return new ArrayList<Integer>(values);

	}

}
