package Lecture09_Recursion;

import java.util.Scanner;

public class BiggestOddDiv {
    public static int largestOddDivisor(int n) {
        if (n % 2 == 0) {
            return largestOddDivisor(n/2);
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(largestOddDivisor(n));
    }
}
