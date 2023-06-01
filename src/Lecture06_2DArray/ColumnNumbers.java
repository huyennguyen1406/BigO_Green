package Lecture06_2DArray;

import java.util.Scanner;

public class ColumnNumbers {
    static boolean isAllNegatives(int a[][], int m, int col) {
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            if (a[i][col] >= 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        for (int j = 0; j < n; j++) {
            if (isAllNegatives(a, m, j))
                System.out.print(j + " ");
        }
    }
}
