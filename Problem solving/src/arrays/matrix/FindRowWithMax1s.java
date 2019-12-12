package arrays.matrix;

public class FindRowWithMax1s {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 } };
		System.out.println(checkRowWithMaxOnes(matrix));
	}

	private static int checkRowWithMaxOnes(int[][] matrix) {
		int runningColumnIdx = matrix[0].length - 1;
		System.out.println("running: "+runningColumnIdx);
		int max = 0;
		for (int i = 0; i < matrix.length;i++) {
			System.out.println("in i "+i);
			for(int j = runningColumnIdx; j >= 0;j--) {
				System.out.println("j : "+j);
				if(matrix[i][j] == 0) {
					System.out.println("breaking i: "+i+" , j: "+j);
					break;
				}
				if(j == 0) {
					return i;
				}
				max = i;
				runningColumnIdx = j;
				System.out.println("max : "+max);
			}
		}
		return max;
	}
}
