import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//
////		System.out.println(isPalindrome());
////		int[] arr = new int[256];
////		System.out.println((int)'a');
//
////		int i = 2306996 & (4);
////		System.out.println(i);
//		
//		System.err.println(2306996 & (16 - 1));

//		List<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(1);
//	list.forEach(name -> {System.out.println(name)});
		
//		String str = "abdfgtabcdresabcd";
//		String s = "tabcd";
//		String s1 = "abcd";
//																							
//		System.err.println(str.contains(s));
//		System.err.println(str.indexOf(s));
//		System.err.println(str.indexOf(s1));
		
		List<String> names = new ArrayList<String>();
		names.add("f");
		names.add("a");
		names.add("b");
		names.add("a");
		names.add("g");
		new String().compareTo("a");
		Collections.sort(names);
		System.out.println(names);
	}

//	public static void main(String[] args) {
//
//		// creating sample Collection
//		List<Integer> myList = new ArrayList<Integer>();
//		for (int i = 0; i < 10; i++)
//			myList.add(i);
//
//		// traversing using Iterator
//		Iterator<Integer> it = myList.iterator();
//		while (it.hasNext()) {
//			Integer i = it.next();
//			System.out.println("Iterator Value::" + i);
//		}
//
//		// traversing through forEach method of Iterable with anonymous class
//		myList.forEach(new Consumer<Integer>() {
//
//			public void accept(Integer t) {
//				System.out.println("forEach anonymous class Value::" + t);
//			}
//
//		});
//
//		// traversing with Consumer interface implementation
//		MyConsumer action = new MyConsumer();
//		myList.forEach(action);
//
//	}

//	class MyConsumer implements Consumer<Integer> {
//
//		public MyConsumer() {
//
//		}
//
//		public void accept(Integer t) {
//			System.out.println("Consumer impl Value::" + t);
//		}
//
//	}

	private static boolean isPalindrome() {
		int[] arr = new int[256];

		String str = "aaabbbb";

		for (int i = 0; i < str.length(); i++) {
//			System.out.println(arr[str.charAt(i)]);
			arr[str.charAt(i)]++;
		}
		int odd = 0;

		for (int i = 0; i < 256; i++) {
			if ((arr[i] & 1) != 0) {
//				System.out.println(arr[i]+" "+(arr[i] & 1));
				odd++;
			}

			if (odd > 1) {
				return false;
			}
		}
		return true;
	}

}
