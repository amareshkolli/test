package algo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] argS) {
		System.err.println(StringReduction("1 6 2 3 5"));
	}

	static int StringReduction(String S) {
		String[] elements = S.split(" ");
		int highestLength = 0;
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (i != j) {
					if (Integer.parseInt(elements[i]) < Integer.parseInt(elements[j])) {
						count++;
					}
				}
			}
			if (highestLength < count) {
				highestLength = count;
			}
			count = 0;
		}
		return highestLength;
	}

}
