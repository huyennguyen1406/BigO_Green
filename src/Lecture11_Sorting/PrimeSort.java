package Lecture11_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        sortArray(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
    public static void sortArray(int[] arr) {
        List<Integer> primes = new ArrayList<>();
        List<Integer> nonPrimes = new ArrayList<>();
        for (int num : arr) {
            if (isPrimeNumber(num)) {
                primes.add(num);
            } else {
                nonPrimes.add(num);
            }
        }
        Collections.sort(nonPrimes);
        int primeIndex = 0;
        int nonPrimeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                arr[i] = primes.get(primeIndex++);
            } else {
                arr[i] = nonPrimes.get(nonPrimeIndex++);
            }
        }
    }
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
