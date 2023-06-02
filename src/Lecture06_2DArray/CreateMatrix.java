package Lecture06_2DArray;

import java.util.Scanner;

public class CreateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int A[][] = new int[m][];
        for (int i = 0; i < m; i++)
            A[i] = new int[n];

        A[0][0] = a;
        A[0][1] = b;
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (!((i == 0 && j == 0)||(i == 0 && j == 1))) {
                    A[i][j] = (a + b) % p;
                    a = b;
                    b = A[i][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }
}
