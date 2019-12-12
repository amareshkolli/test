package array;

public class HourGlassSum {

	static int hourglassSum(int[][] a) {
		
//		for(int i = 0;i < a.length; i++) {
//			for(int j = 0;j < a.length; j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		int[][] hourGlassSumAr = new int[a.length - 2][a.length - 2];
		int sum = 0;
		int highestSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = 0; j < a.length - 2; j++) {
				sum = 0;
				sum += a[i][j] + a[i][j + 1] + a[i][j + 2];
				sum += a[i + 1][j + 1];
				sum += a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
				hourGlassSumAr[i][j] = sum;
				System.out.println("sum"+ sum);
				if (sum > highestSum) {
					highestSum = sum;
				}
			}
		}
		return highestSum;
	}

	public static void main(String[] args) {
		int[][] a = new int[6][6];
		
		a[0][0] = 0;
		a[0][1] = -4;
		a[0][2] = -6;
		a[0][3] = 0;
		a[0][4] = -7;
		a[0][5] = -6;
		
		a[1][0] = -1;
		a[1][1] = -2;
		a[1][2] = -6;
		a[1][3] = -8;
		a[1][4] = -3;
		a[1][5] = -1;
		
		a[2][0] = -8;
		a[2][1] = -4;
		a[2][2] = -2;
		a[2][3] = -8;
		a[2][4] = -8;
		a[2][5] = -6;
		
		a[3][0] = -3;
		a[3][1] = -1;
		a[3][2] = -2;
		a[3][3] = -5;
		a[3][4] = -7;
		a[3][5] = -4;
		
		a[4][0] = -3;
		a[4][1] = -5;
		a[4][2] = -3;
		a[4][3] = -6;
		a[4][4] = -6;
		a[4][5] = -6;
		
		a[5][0] = -3;
		a[5][1] = -6;
		a[5][2] = 0;
		a[5][3] = -8;
		a[5][4] = -6;
		a[5][5] = -7;
		
		System.out.println(hourglassSum(a));
	}

}
