
public class MagicNumber {

	static int reverseNum(int num) {
		int rev = 0;
		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return rev;
	}

	static boolean isMysteryNumber(int n) {
		for (int i = 1; i <= n / 2; i++) {
			// if found print the pair, return
			int j = reverseNum(i);
//			System.err.println("i : "+i+" rev : "+j);
			if (i + j == n) {
				System.out.println(i + " " + j);
				return true;
			}
		}
		System.out.println("Not a Mystery Number");
		return false;
	}

	public static void main(String[] args) {
		int n = 121;
		isMysteryNumber(n);
	}

}
