package Lecture11_Sorting;

import java.util.Scanner;

public class OddEvenSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] evens = new int[n];
        int[] odds = new int[n];
        int[] evenIndexes = new int[n];
        int[] oddIndexes = new int[n];
        int numEvens = 0;
        int numOdds = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                evens[numEvens] = x;
                evenIndexes[numEvens] = i;
                numEvens++;
            } else {
                odds[numOdds] = x;
                oddIndexes[numOdds] = i;
                numOdds++;
            }
        }

        selectionSort(evens, numEvens);
        selectionSort(odds, numOdds, false);

        int[] result = new int[n];

        for (int i = 0; i < numEvens; i++) {
            result[evenIndexes[i]] = evens[i];
        }
        for (int i = 0; i < numOdds; i++) {
            result[oddIndexes[i]] = odds[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static void selectionSort(int[] arr, int n, boolean ascending) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (ascending) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                } else {
                    if (arr[j] > arr[minIndex]) {
                        minIndex = j;
                    }
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    private static void selectionSort(int[] arr, int n) {
        selectionSort(arr, n, true);
    }
}
