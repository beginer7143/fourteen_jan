/*
Challenge 1: Count Positive, Negative and Zero Elements
Problem Statement
You are given an array of integers representing daily profit and loss values.
 Write a Java program to count:
●	Number of positive values

●	Number of negative values

●	Number of zero values

Input Format
●	First line: Integer n

●	Second line: n space-separated integers

Output Format
Positive: X
Negative: Y
Zero: Z

Constraints
●	1 ≤ n ≤ 100

●	-1000 ≤ arr[i] ≤ 1000

Sample Input
6
10 -5 0 20 -3 0

Sample Output
Positive: 2
Negative: 2
Zero: 2

*/
package fourteen_jan;

import java.util.Scanner;

public class Challenge_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		 for (int i = 0; i < num; i++) {
	            arr[i] = sc.nextInt();
	        }
		int positiveCount =0;
		int negativeCount = 0;
		int zeroCount =0;
		
		 for (int i = 0; i < num; i++) {
	            if (arr[i] > 0) {
	                positiveCount++;
	            } else if (arr[i] < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }
	        }
		
		System.out.print("Positive: "+positiveCount);
		System.out.print("\nNegative: "+negativeCount);
		System.out.print("\nZero: "+zeroCount);
		
		sc.close();
	}
}
