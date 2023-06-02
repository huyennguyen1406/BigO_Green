package Lecture06_2DArray;

import java.util.Scanner;

public class Product2Diagonal {
    public static boolean isPrime(int n) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean[] primes = new boolean[1001];
        for (int i = 2; i <= 1000; i++) {
            primes[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    primes[j] = false;
                }
            }
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            if (primes[matrix[i][n - i - 1]]) {
                product = (product * matrix[i][n - i - 1]) % 1000003;
            }
        }

        System.out.println(product != 0 ? product : 1);
    }
}
