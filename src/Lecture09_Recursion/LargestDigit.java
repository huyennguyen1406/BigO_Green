package Lecture09_Recursion;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxDigit(n, 0));
        sc.close();
    }

    public static int maxDigit(int n, int maxDigitCurrent) {
        if (n == 0) {
            return maxDigitCurrent;
        }
        if (n < 0) {
            return 0;
        } else {
            int digit = n % 10;
            if (digit > maxDigitCurrent) {
                maxDigitCurrent = digit;
            }
            return maxDigit(n / 10, maxDigitCurrent);
        }
    }
}
