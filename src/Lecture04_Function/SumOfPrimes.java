package Lecture04_Function;

import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
