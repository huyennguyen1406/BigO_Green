package Lecture11_Sorting;

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        double median;
        if (n % 2 == 1) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println(median);
    }
}
