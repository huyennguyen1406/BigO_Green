package Lecture11_Sorting;

import java.util.Scanner;

public class SortInDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        mergeSort(a, a.length);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void merge(int []L, int n1, int []R, int n2, int []a, int n) {
        int i, j, k;
        i = j = k = 0;
        while (i < n1 && j < n2) {
            if(L[i] < R[j]) {
                a[k] = R[j];
                j++;
            }
            else {
                a[k] = L[i];
                i++;
            }
            k++;
        }
        while(i < n1) {
            a[k] = L[i]; i++; k++;
        }
        while(j < n2) {
            a[k] = R[j]; j++; k++;
        }
    }

    public static void mergeSort(int []a, int n) {
        if (n > 1) {
            int n1 = n / 2;
            int n2 = n - n1;
            int[] L;
            int[] R;
            L = new int[n1];
            R = new int[n2];

            for (int i = 0; i < n1; i++) {
                L[i] = a[i];
            }
            for (int i = 0; i < n2; i++) {
                R[i] = a[i + n1];
            }

            mergeSort(L, n1);
            mergeSort(R, n2);
            merge(L, n1, R, n2, a, n);

        }
    }
}
