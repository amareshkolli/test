package com.test;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println(m1(3));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	public static String m1(int n) {

		StringBuffer s = new StringBuffer("0");
		int n_squared = n * n;
		for (int i = 0; i < n_squared; i++) {
			s.append(", " + i);
		}
		return s.toString();
	}

	public static String m(Test o1, Test o2) {
		String s1 = o1 == o2 ? "T" : "F";
		String s2 = o1.equals(o2) ? "T" : "F";
		String s3 = o1.hashCode() == o2.hashCode() ? "T" : "F";
		return s1 + s2 + s3;

	}

	public class C {
		public float m(float x, float y) throws IOException {
			return 0;
		}
	}

	public class D extends C {
		@Override
		public float m(float x, float y) {
			return 0;
		}
	}

}
