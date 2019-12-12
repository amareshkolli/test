class Solution {
	
	
	
	
	public static void main(String[] args) {
		int n = 22;
		isMagicNumber(n);
	}
	
//	static int reverseNum(int x) {
//		String s = Integer.toString(x);
//		String str = "";
//		for (int i = s.length() -1; i >=0;i--) {
//			str = str+s.charAt(i);
//		}
//		int rev = Integer.parseInt(str);
//		return rev;
//	}

	static int reverseNum(int num) {
		int rev = 0;
		while(num !=0 ) {
			int digit = num %10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		return rev;
	}
	
	static boolean isMagicNumber(int n ) {
		for(int i = 1; i <= n/2; i++) {
			int j = reverseNum(i);
			if(i+j ==n) {
				System.out.println("i : "+i+" j : "+j);
				return true;
			}
		}
		return false;
	}
	
	
//	public static void main(String[] args) {
//		Solution s = new Solution();
//		int output = s.solution(new int[] { -1, -3,0});
//		System.err.println("res: " + (output));
//	}

//	public int solution(int[] A) {
//		// write your code in Java SE 8
//		int n = A.length;
//		sort(A, 0, n - 1);
////		for (int i = 0; i < A.length; i++) {
////			System.out.println(A[i]);
////		}
////		System.out.println("len: " + A.length);
//		for (int i = 0; i < A.length-1; i++) {
////			System.out.println("a[i]: " + A[i]);
////			System.out.println("a[i+1]: " + A[i + 1]);
////			System.out.println("A[i] + 1 : " + (A[i] + 1));
////			System.out.println("");
//			if (A[i] > 0) {
//				if ((A[i + 1] != A[i]) && (A[i + 1] != (A[i] + 1))) {
//					return i + 1;
//				}
//			}
//		}
//		return computeResult(A[A.length-1]);
//	}
//
//	private int computeResult(int i) {
//		if(i > 0) {
//			return (i+1);
//		} else {
//			return 1;
//		}
//	}
//	private void sort(int arr[], int low, int high) {
//		if (low < high) {
//			int index = partition(arr, low, high);
//			sort(arr, low, index - 1);
//			sort(arr, index + 1, high);
//		}
//	}
//
//	private int partition(int arr[], int low, int high) {
//		int pivot = arr[high];
//		int i = (low - 1);
//		for (int j = low; j < high; j++) {
//			if (arr[j] < pivot) {
//				i++;
//				int temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//			}
//		}
//		int temp = arr[i + 1];
//		arr[i + 1] = arr[high];
//		arr[high] = temp;
//		return i + 1;
//	}

}