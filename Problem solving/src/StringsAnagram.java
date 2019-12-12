
public class StringsAnagram {

	public static void main(String[] args) {
		String s1 = "abcfd";
		String s2 = "dcfab";

		System.out.println(checkIfTwoStringsAreAnagramOfEachOther(s1, s2));
	}

	private static boolean checkIfTwoStringsAreAnagramOfEachOther(String s1, String s2) {
		char[] data1 = s1.toCharArray();
		char[] data2 = s2.toCharArray();
		int[] chars = new int[26];

		for (Character ch : data1) {
			chars[ch - 'a']++;
		}

		for (Character ch : data2) {
			chars[ch - 'a']++;
		}

		for (int i = 0; i < chars.length; i++) {

			if ((chars[i] & 1) != 0) {
				return false;
			}

		}
		return true;
	}

}
