/*
Challenge 2: Check if All Elements Are Unique
Problem Statement
Given an array of integers, check whether all elements are unique.
 If any element repeats, print NO, otherwise print YES.
Input Format
●	First line: Integer n

●	Second line: n space-separated integers

Output Format
●	Print YES or NO

Constraints
●	1 ≤ n ≤ 100

●	1 ≤ arr[i] ≤ 1000

Sample Input
5
3 6 1 9 4

Sample Output
YES

*/
package fourteen_jan;

import java.util.Scanner;

public class Challenge_2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int[] arr = new int[n];

		
	for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			if (arr[i] == arr[j]) {
		 		System.out.println("NO");
	 		}
		}
	}

	System.out.println("YES");
 	sc.close();
		   
	}
}
