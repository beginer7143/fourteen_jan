/*
Challenge 4: Check if Array is Palindrome
Problem Statement
An array is said to be a palindrome if it reads the same from left to right and right to left.
 Write a Java program to check whether the given array is a palindrome.
Input Format
●	First line: Integer n

●	Second line: n space-separated integers

Output Format
●	Print YES or NO

Constraints
●	1 ≤ n ≤ 100

●	0 ≤ arr[i] ≤ 9

Sample Input
5
1 2 3 2 1

Sample Output
YES

*/
package fourteen_jan;
import java.util.Scanner;

public class  Challenge_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                System.out.println("NO");
                sc.close();
                return;
            }
        }

       
        System.out.println("YES");
        sc.close();
    }
}


