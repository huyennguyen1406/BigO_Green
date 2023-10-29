package Lecture16_Final;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] A = new int[m];
        int[] B = new int[n];

        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        int[] C = mergeArr(A, B);
        Arrays.sort(C);

        int result = getSmallest(k, C);
        System.out.println(result);
        sc.close();
    }

    public static int[] mergeArr(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[] C = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < m) {
            C[k++] = A[i++];
        }
        while (j < n) {
            C[k++] = B[j++];

        }
        return C;
    }
    public static int getSmallest(int k, int[] C) {
        return C[k];
    }
}
