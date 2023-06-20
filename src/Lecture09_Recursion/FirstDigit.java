package Lecture09_Recursion;

import java.util.Scanner;

public class FirstDigit {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(firstDigit(n));
        }

        public static int firstDigit(int n) {
            if (Math.abs(n) < 10) {
                return Math.abs(n);
            } else {
                return firstDigit(n / 10);
            }
        }
}
