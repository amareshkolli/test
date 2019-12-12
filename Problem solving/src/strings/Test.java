package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
//		System.out.println(firstUniqChar("ffleetcode"));
		String str = "leetcode";
//		System.out.println(frequencySort(str));
		System.out.println(isPalindrome("abbc"));
	}

	public static int firstUniqChar(String s) {
		int[] arr = new int[26];
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			arr[chars[i] - 'a']++;
		}
		for (int i = 0; i < chars.length; i++) {
			if (arr[chars[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isPalindrome(String s) {
		int[] arr = new int[26];
		char[] chars = s.toCharArray();

		for (char sc : chars) {
			arr[sc - 'a']++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if ((arr[i] & 1) != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isAnagram(String s, String t) {
		int[] sA = new int[26];

		char[] sChars = s.toCharArray();
		char[] bChars = t.toCharArray();

		for (char sc : sChars) {
			sA[sc - 'a']++;
		}
		for (char bc : bChars) {
			sA[bc - 'a']--;
		}

		for (int i = 0; i < sA.length; i++) {
			if (sA[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static String frequencySort(String s) {
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}

		Queue<String> pq = new PriorityQueue<String>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -(countMap.get(o1) - countMap.get(o2));
			}
		});

		for (String ss : countMap.keySet()) {
			pq.offer(ss);
		}

		Iterator<String> itr = pq.iterator();
		StringBuilder ret = new StringBuilder();

		while (!pq.isEmpty()) {
			String outputChar = pq.poll();
			if (outputChar != null) {
				int count = countMap.get(outputChar);
				for (int j = 0; j < count; j++) {
					ret.append(outputChar);
				}
			}
		}

		return ret.toString();
	}

}
