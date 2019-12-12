import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutRepChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("pwwkew"));

//		System.out.println(Math.max(100, 2));

//		System.out.println(lls("pwwkew"));
	}

	public static int lengthOfLongestSubstring(String s) {
		int longest = 0;
		int count = 0;
		int breakPoint = 0;
		if (s == null) {
			return 0;
		}
		if (s.length() <= 1) {
			return s.length();
		}
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = breakPoint; j < i; j++) {
				if (chars[i] == chars[j]) {
					if (count > longest) {
						longest = count;
					}
					count = 0;
					i = j + 1;
					breakPoint = j + 1;
					break;
				}
			}
			count++;
			if (count > longest) {
				longest = count;
			}
		}
		return longest;
	}

	private static int lls(String s) {

		int max = 0;
		int count = 0;

		if (s == null) {
			return 0;
		}
		if (s.length() <= 1) {
			return s.length();
		}

		Set<Character> set = new LinkedHashSet<Character>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println("i: " + i + " data : " + chars[i]);
			if (set.contains(chars[i])) {
				System.out.println("set already has : " + chars[i]);
				if (count > max) {
					max = count;
				}
				set.add(chars[i]);
				count = set.size();
				System.out.println("count init : " + count);
			} else {
				System.out.println(chars[i] + " doesnt exist, adding to set");
				set.add(chars[i]);
				++count;
				System.out.println("count : " + count);
			}
		}
		return count;
	}

//	public static int lengthOfLongestSubstring(String s) {
//
//		int max = 0;
//		int count = 1;
//
//		if (s == null || s.length() <= 1) {
//			return s.length();
//		}
//
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println("i: " + i);
//			for (int j = i + 1; j < s.length(); j++) {
//				System.out.println("j: " + j);
//				if (s.charAt(i) == s.charAt(j)) {
//					if (max < count) {
//						max = count;
//					}
//					System.out.println("matched, count : " + count);
//					count = 0;
//					break;
//				}
//				System.out.println("i : " + s.charAt(i) + " j: " + s.charAt(j));
//				count++;
//			}
//		}
//
//		return max;
//	}

}
