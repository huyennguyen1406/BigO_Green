package Lecture09_Recursion;

import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = decimalToBinary(n);
        System.out.println(binary);
    }

    public static String decimalToBinary(int n) {
        if (n == 0 || n == 1) {
            return Integer.toString(n);
        } else {
            int remainder = n % 2;
            int quotient = n / 2;
            String quotientBinary = decimalToBinary(quotient);
            return quotientBinary + Integer.toString(remainder);
        }
    }
}
