package com.test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the braces function below.

    public static char[][] tokens = {{'{','}'}, {'[',']'}, {'(',')'}};

    static String[] braces(String[] values) {
        String[] result = new String[values.length];

        for (int i = 0; i< values.length; i++) {
            if(isBalanced(values[i])) {
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }

    static boolean isBalanced(String val) {
      Stack<Character> stack = new Stack<Character>();
        for (char c : val.toCharArray()) {
        if(isOpenBrace(c)) {
            stack.push(c);
        } else {
            if(stack.isEmpty() || !matches(stack.pop(), c)) {
                return false;
            } 
         }
      } 
      return stack.isEmpty();         
    }

    static boolean isOpenBrace(char c) {
        for(char[] array : tokens) {
            if(array[0] == c) {
                return true;
            }
        }
        return false;
    }

    static boolean matches(char openTerm, char closeTerm) {
        for(char[] array : tokens) {
            if(array[0] == openTerm) {
                return array[1] == closeTerm;
            }
        }
        return false;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int valuesCount = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String[] values = new String[valuesCount];
//
//        for (int i = 0; i < valuesCount; i++) {
//            String valuesItem = scanner.nextLine();
//            values[i] = valuesItem;
//        }
//
//        String[] res = braces(values);
//
//        for (int i = 0; i < res.length; i++) {
//            bufferedWriter.write(res[i]);
//
//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
