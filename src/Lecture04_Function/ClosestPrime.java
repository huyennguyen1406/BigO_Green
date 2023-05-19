package Lecture04_Function;

import java.util.Scanner;

public class ClosestPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n)
                ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int closestPrime = 0;
        for (int m = n; m <= 10000; m++) {
            if (isPrime(m)) {
                closestPrime = m;
                break;
            }
        }
        if (closestPrime == 0) {
            for (int m = n-1; m >= 2; m--) {
                if (isPrime(m)) {
                    closestPrime = m;
                    break;
                }
                else if (Math.abs(m-n) < Math.abs(closestPrime-n)) {
                    closestPrime = m;
                } else if (Math.abs(m-n) == Math.abs(closestPrime-n) && m < closestPrime) {
                    closestPrime = m;
                }
            }
        }
        System.out.println(closestPrime);
        sc.close();
    }
}
