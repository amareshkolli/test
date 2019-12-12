package com.misc.excercise;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER. The function accepts
 * 2D_INTEGER_ARRAY arr as parameter.
 */

public class AbsDiffOfDiagnalSumInMatrix {
	public static void main(String[] args) throws IOException {
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		row1.add(2);
		row1.add(3);

		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(4);
		row2.add(5);
		row2.add(6);

		List<Integer> row3 = new ArrayList<Integer>();
		row3.add(9);
		row3.add(8);
		row3.add(9);

		List<List<Integer>> rows = new ArrayList<List<Integer>>();
		rows.add(row1);
		rows.add(row2);
		rows.add(row3);
		System.out.println(diagonalDifference(rows));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		System.err.println("rows size: " + arr.size());
		System.err.println("cols size :" + arr.get(0).size());
		int rowSize = arr.size();
		int colSize = arr.get(0).size();
		System.out.println("colSize :" + colSize);
		int pos = 1;

		int diag1Sum = 0;
		int diag2Sum = 0;

		int diag1Pos = 0;
		int diag2Pos = colSize - 1;

		for (List<Integer> list : arr) {
//			for (Integer num : list) {

			diag1Sum += list.get(diag1Pos);
			diag2Sum += list.get(diag2Pos);
			diag1Pos += 1;
			diag2Pos -= 1;
//				System.out.println(num);
//				System.out.println("pos : " + pos);
//				if (pos == diag1Pos || pos == (diag1Pos + colSize + 1)) {
//					diag1Sum += num;
//					diag1Pos = pos;
//					System.out.println("adding " + num + " to diag1");
//				}
//				if ((pos - 1 < ((colSize * rowSize) - 2)) && (pos == diag2Pos || pos == (diag2Pos + 2))) {
//					System.out.println("adding " + num + " to diag2 " + diag2Pos + " pos: " + pos + " break cond : "
//							+ ((colSize * rowSize) - 2));
//					diag2Sum = +num;
//					diag2Pos = pos;
//				}
//				pos++;
//			}
		}
		System.err.println("diag1Sum: " + diag1Sum + " diag2Sum: " + diag2Sum);
		return Math.abs(diag1Sum - diag2Sum);
	}
}
