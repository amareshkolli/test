package com.string;

public class StringReverse {

	public static void main(String[] args) {
//		System.out.println(reverseString("  hello        world!         "));
//		String s = "    ";
//		System.out.println(s.length());
	}

	private static String reverseString(String s) {

//		StringBuilder value = new StringBuilder();
//		String[] elements = s.trim().split(" +");
//		for (int i = elements.length - 1; i >= 0; i--) {
//			value.append(elements[i] + " ");
//		}
//		return value.toString().trim();

		if (s.length() == 0) {
			return s;
		}
		String words[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		int i;

		for (i = words.length - 1; i >= 0; i--) {
			System.out.println("word : " + words[i]);
			if (words[i].length() > 0) {
				sb.append(words[i]);
				sb.append(" ");
			}
		}

		return sb.toString().trim();
	}

}
