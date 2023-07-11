package Lecture11_Sorting;

import java.util.Scanner;

public class PrimeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            isPrime[i] = isPrimeNumber(arr[i]);
        }
        insertionSort(arr);
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                int index = findIndex(arr[i], arr);
                arr[index] = arr[i];
                arr[i] = -1; // đánh dấu phần tử đã được sắp xếp
            }
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static boolean isPrimeNumber(int n) {
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

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static int findIndex(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
