package algo;

import java.util.Arrays;

public class RepeatElement {
	void printRepeating(int arr[], int size) {
		System.out.println("sixe : " + size);
		int count[] = new int[size];
		int i;

		System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++) {
			System.out.println("i : " + i);
			System.out.println("arr[i]: " + arr[i] + " count[arr[i]: " + count[arr[i]]);
			if (count[arr[i]] == 1) {
				System.out.print(arr[i] + " ");
				count[arr[i]]++;
			} else {
				count[arr[i]]++;
			}
			System.out.println(Arrays.toString(count));
		}
	}

	public static void main(String[] args) {
		RepeatElement repeat = new RepeatElement();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);
	}
}
