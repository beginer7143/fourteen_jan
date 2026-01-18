/*
Challenge 3: Count Elements Greater Than First Element
Problem Statement
You are given an array of integers.
 Write a Java program to count how many elements are greater than the first element of the array.
Input Format
●	First line: Integer n

●	Second line: n space-separated integers

Output Format
●	Print count

Constraints
●	1 ≤ n ≤ 100

●	-10^3 ≤ arr[i] ≤ 10^3

Sample Input
5
10 12 5 20 8

Sample Output
2

Explanation:
 Elements greater than 10 → 12, 20

*/
package fourteen_jan;

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];
        int count = 0;

        
        for (int i = 1; i < n; i++) {
            if (arr[i] > first) {
                count++;
            }
        }

      
        System.out.println(count);

        sc.close();
    }
}

