package Lecture09_Recursion;

import java.util.Scanner;

public class FirstPrimeNumber {
    public static boolean isPrime(int n, int d) {
        if(n < 2) {
            return false;
        }
        else if (d * d > n) {
            return true;
        }
        else if (n % d == 0) {
            return false;
        }
        else {
            return isPrime(n, d + 1);
        }
    }

    public static int findFirstPrime(int[] arr, int index, int firstPrime) {
        if (index == arr.length) {
            return -1;
        } else if (isPrime(arr[index], 2)) {
            if (firstPrime == -1) {
                return index;
            } else {
                return firstPrime;
            }
        }
        else {
            return findFirstPrime(arr, index + 1, firstPrime);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int firstPrime = findFirstPrime(arr, 0, -1);
        System.out.println(firstPrime);
        sc.close();
    }
}
