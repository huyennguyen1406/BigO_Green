package Lecture11_Sorting;

import java.util.Scanner;

public class SortInAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            int j = i;
            while (j > 0 && A[j - 1] > A[j]) {
                int temp = A[j - 1];
                A[j - 1] = A[j];
                A[j] = temp;
                j--;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
