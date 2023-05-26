package Lecture04_Function;

import java.util.Scanner;

public class ClosestPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.print(n);
        } else {
            int m = n + 1;
            while (!isPrime(m)) {
                m++;
            }
            int p = n - 1;
            while (!isPrime(p)) {
                p--;
            }
            if (n - p < m - n) {
                System.out.print(p);
            } else if (n - p == m - n) {
                System.out.print(p);
            } else {
                System.out.print(m);
            }
        }

    }
}
