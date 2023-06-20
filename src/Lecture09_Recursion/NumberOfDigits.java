package Lecture09_Recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int countDigit( int n, int count) {
        if (n == 0) {
            return count == 0 ? 1 : count;
        } else {
            count += 1;
            return countDigit(n/10, count);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countDigit(n, 0);
        System.out.println(count);
        sc.close();
    }
}
